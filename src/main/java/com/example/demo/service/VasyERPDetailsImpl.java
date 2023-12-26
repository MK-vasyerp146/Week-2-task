package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Buddy;
import com.example.demo.Entity.VasyERP;
import com.example.demo.dto.internDto;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.VasyRepository;

@Service
public class VasyERPDetailsImpl implements VasyERPDetails{
	
	@Autowired
	VasyRepository vasyRepository;

	@Override
	public List<VasyERP> getAllIntern() {
		
		return vasyRepository.findAll();
	}

	@Override
	public VasyERP addIntern(VasyERP vasyerp) {
		
		return vasyRepository.save(vasyerp);
	}



	@Override
	public internDto updateIntern(int internId, VasyERP vasyerp) {
		
		internDto dto = new internDto();
		VasyERP oldIntern= vasyRepository.findById(internId).orElse(null);
		if(oldIntern==null)
		{
			dto.setStatus(404);
			dto.setData("Intern Id Not Found");
			dto.setMsg("Not Found");
			return dto;
			
		}
		else
		{
			oldIntern.setInternName(vasyerp.getInternName());
			oldIntern.setInternDepartment(vasyerp.getInternDepartment());
			vasyRepository.save(oldIntern);
			dto.setData("intern Updated.......");
			dto.setMsg("Ok");
			dto.setStatus(200);
			return dto;
		}
		
//		return 
	}

	@Override
	public VasyERP assignBuddy(int internId, int buddyId) {
		VasyERP erp = vasyRepository.findById(internId).get();
		Buddy buddy = new Buddy();
		buddy.setBuddyId(buddyId);
		erp.setBuddyId(buddy);
		
		
		return vasyRepository.save(erp);
	}

	
	@Override
	public internDto removeIntern(int internId) {
		internDto dto = new internDto();
		VasyERP vId = vasyRepository.findById(internId).orElse(null);
		if(vId == null )
		{
			dto.setStatus(404);
			dto.setData("Intern Id Not Found");
			dto.setMsg("Not Found");
			return dto;
		}
		else
		{
			vasyRepository.deleteById(internId);
			dto.setData("intern deleted....");
			dto.setMsg("Ok");
			dto.setStatus(200);
			return dto;
		}
		
	}
	@Override
	public VasyERP getInternById(int internId) {
		internDto dto = new internDto();
		
		VasyERP erp = vasyRepository.findById(internId).orElseThrow(()-> new StudentNotFoundException("YOu have entered wrong Id........"));
		
		
		return erp;
	}

}
