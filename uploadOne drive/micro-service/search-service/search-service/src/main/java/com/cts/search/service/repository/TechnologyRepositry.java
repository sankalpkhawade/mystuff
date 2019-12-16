package com.cts.search.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.search.service.model.Technology;

public interface TechnologyRepositry extends JpaRepository<Technology, String> {
	
	Technology findByName(String name);

}
