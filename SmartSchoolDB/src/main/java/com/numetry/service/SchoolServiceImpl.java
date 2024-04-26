package com.numetry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.entity.SchoolEntity;
import com.numetry.repository.SchoolRepo;

@Service
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolRepo schollrepo;

	@Override
	public SchoolEntity createSchool(SchoolEntity schoolent) {
		
		return schollrepo.save(schoolent);
	}

	@Override
	public List<SchoolEntity> getAllSchool() {
		
		return schollrepo.findAll();
	}

	@Override
	public SchoolEntity getSchoolById(Long id) {
		
		return schollrepo.findById(id).get();
	}

	@Override
	public void deleteSchool(Long id) {
	 SchoolEntity schooent=	schollrepo.findById(id).get();
		if(schooent!=null) {
			schollrepo.delete(schooent);
		}
		
	}

	@Override
	public SchoolEntity updateSchool(Long id, SchoolEntity schoolent) {
		SchoolEntity oldobj= schollrepo.findById(id).get();
		if(oldobj!=null) {
			schoolent.setId(id);
			return schollrepo.save(schoolent);
		}
		
		return null;
	}

}
