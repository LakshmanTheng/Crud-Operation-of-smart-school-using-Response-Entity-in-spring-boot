package com.numetry.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.numetry.entity.SchoolEntity;
import com.numetry.repository.SchoolRepo;
import com.numetry.service.SchoolService;

@Controller
@RequestMapping("/api/l/")
public class SchoolController {
	
	@Autowired
	private SchoolService schoser;
	
	@PostMapping("/saveSchool")
	public ResponseEntity<SchoolEntity> createSchool(@RequestBody SchoolEntity scen){
		
		return new ResponseEntity<SchoolEntity>(schoser.createSchool(scen), HttpStatus.CREATED);
	}
	
	@GetMapping("/allSchool")
	public ResponseEntity<List<SchoolEntity>> getAllSchool(){
		
		return new ResponseEntity<List<SchoolEntity>>(schoser.getAllSchool(), HttpStatus.OK);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<SchoolEntity> getSchoolById(@PathVariable Long id){
		return new ResponseEntity<SchoolEntity>(schoser.getSchoolById(id), HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteSchool(@PathVariable Long id){
		schoser.deleteSchool(id);
		return new ResponseEntity<String>("Delete Successfully", HttpStatus.OK);
		
	}
	@PutMapping("/updateSchool/{id}")
	public ResponseEntity<SchoolEntity> updateSchool(@PathVariable Long id, @RequestBody SchoolEntity schoolent){
		
		return new ResponseEntity<SchoolEntity>(schoser.updateSchool(id, schoolent), HttpStatus.OK); 
	}

}
