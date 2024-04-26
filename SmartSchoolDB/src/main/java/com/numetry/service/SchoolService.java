package com.numetry.service;

import java.util.List;

import com.numetry.entity.SchoolEntity;

public interface SchoolService {

	public SchoolEntity createSchool(SchoolEntity schent);
	
	public List<SchoolEntity> getAllSchool();
	
	public SchoolEntity getSchoolById(Long id);
	
	public void deleteSchool(Long id);
	
	public SchoolEntity updateSchool(Long id, SchoolEntity schoolent);
	
}
