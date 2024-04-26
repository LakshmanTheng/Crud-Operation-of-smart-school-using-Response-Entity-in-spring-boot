package com.numetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.entity.SchoolEntity;

@Repository
public interface SchoolRepo extends JpaRepository<SchoolEntity, Long>{

}
