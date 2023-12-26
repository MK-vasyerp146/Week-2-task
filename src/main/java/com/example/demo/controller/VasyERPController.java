package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.VasyERP;
import com.example.demo.dto.internDto;
import com.example.demo.service.VasyERPDetails;


@Controller
@RequestMapping("/VasyERPDetails")
public class VasyERPController {
	
	@Autowired
	VasyERPDetails details;
	
	@GetMapping("/getAllIntern")
	@ResponseBody
	public List<VasyERP> getAllIntern()
	{
		return details.getAllIntern();
	}
	
	@GetMapping("/getInternById")
	@ResponseBody
	public ResponseEntity<VasyERP> getInternById( @RequestParam("internId") int internId)
	{
		VasyERP cdto = details.getInternById(internId);
		return new ResponseEntity<VasyERP>(cdto,HttpStatusCode.valueOf(200));
	
	}
	
	@PostMapping("/addNewIntern")
	@ResponseBody
	public VasyERP addNewIntern(@RequestBody VasyERP vasyERP)
	{
		return details.addIntern(vasyERP);
		
	}
	
	@DeleteMapping("/removeIntern")
	@ResponseBody
	public ResponseEntity<internDto> removeIntern(@RequestParam("internId") int internId){
		internDto cdto =details.removeIntern(internId);
		
		System.err.println(internId);
		
		return new ResponseEntity<>(cdto,HttpStatusCode.valueOf(cdto.getStatus()));
		
	}
	
	@PutMapping("/UpdateInternInfo/{internId}")
	@ResponseBody
	public ResponseEntity<internDto> updateInternInfo(@PathVariable("internId") int internId,@RequestBody VasyERP vasyERP)
	{
		internDto updatedIntern = details.updateIntern(internId, vasyERP);
		return new ResponseEntity<>(updatedIntern,HttpStatusCode.valueOf(updatedIntern.getStatus()));
	
	}
	
	@PutMapping("/assignBuddy")
	@ResponseBody
	public VasyERP assignBuddy(@RequestParam("internId") int InternId, @RequestParam("buddyId") int  buddyId)
	{
		return details.assignBuddy(InternId, buddyId);
	}
	
	
}
