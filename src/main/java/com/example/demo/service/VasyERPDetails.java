package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.VasyERP;
import com.example.demo.dto.internDto;

public interface VasyERPDetails {
	
	List<VasyERP> getAllIntern();
	
	VasyERP getInternById(int internId);
	
	VasyERP addIntern(VasyERP vasyerp);
	
	internDto removeIntern(int internId);
	
	internDto updateIntern(int internId, VasyERP vasyerp);
	
	VasyERP assignBuddy(int internId, int buddyId);

}
