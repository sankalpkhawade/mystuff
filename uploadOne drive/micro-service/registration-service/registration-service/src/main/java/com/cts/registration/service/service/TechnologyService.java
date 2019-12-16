package com.cts.registration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registration.service.model.Technology;
import com.cts.registration.service.repository.TechnologyRepositry;

@Service
public class TechnologyService {

	@Autowired
	TechnologyRepositry technologyRepositry;

	public void saveTechnology(Technology technology) {
		technologyRepositry.save(technology);
	}

	public Technology getTechnology(String name) {
		return technologyRepositry.findByName(name);
	}
}
