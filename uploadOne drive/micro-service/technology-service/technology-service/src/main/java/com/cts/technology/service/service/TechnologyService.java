package com.cts.technology.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.technology.service.model.Technology;
import com.cts.technology.service.repository.TechnologyRepositry;

@Service
public class TechnologyService {

	@Autowired 
	TechnologyRepositry technologyRepositry;
	
	public void saveTechnology(Technology technology) {
		technologyRepositry.save(technology);
	}
	
	public List<Technology> getAllTechnology() {
		return technologyRepositry.findAll();
	}
	
	public Technology getTechnology(String name) {
		return technologyRepositry.findByName(name);
	}
	
	public void deleteTechnology(String technologyName) {
		technologyRepositry.delete(technologyRepositry.findByName(technologyName));
	}
}
