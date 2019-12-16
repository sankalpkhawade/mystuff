package com.cts.technology.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.technology.service.model.Technology;

public interface TechnologyRepositry extends JpaRepository<Technology, String> {
	
	Technology findByName(String name);

}
