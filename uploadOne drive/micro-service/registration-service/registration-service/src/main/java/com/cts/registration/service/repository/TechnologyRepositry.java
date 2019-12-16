package com.cts.registration.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.registration.service.model.Technology;

public interface TechnologyRepositry extends JpaRepository<Technology, String> {

	Technology findByName(String name);

}
