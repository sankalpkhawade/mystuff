package com.cts.technology.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.technology.service.model.Technology;
import com.cts.technology.service.service.TechnologyService;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
	
	@Autowired
	TechnologyService technologyService;

	@GetMapping("/{tech}")
	public Technology getTechnology(@PathVariable("tech") String name) {
		return technologyService.getTechnology(name);
	}
	
	@GetMapping("")
	public List<Technology> getAllTechnology() {
		return technologyService.getAllTechnology();
	}
	
	@PostMapping("")
	public void postTechnology(@RequestBody Technology technology) {
		technologyService.saveTechnology(technology);
	}
	
	@DeleteMapping("/{name}")
	public void deleteTechnology(@PathVariable("name") String technologyName) {
		technologyService.deleteTechnology(technologyName);
	}
}
