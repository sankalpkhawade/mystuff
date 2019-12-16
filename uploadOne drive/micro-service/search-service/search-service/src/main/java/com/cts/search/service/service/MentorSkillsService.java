package com.cts.search.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.search.service.model.MentorSkills;
import com.cts.search.service.repository.MentorSkillsRepository;
import com.cts.search.service.repository.TechnologyRepositry;

@Service
public class MentorSkillsService {

	@Autowired
	MentorSkillsRepository mentorSkillsRepository;
	
	@Autowired
	TechnologyRepositry technologyRepositry;
	
	public void saveSkills(MentorSkills mentorSkills) {
		mentorSkillsRepository.save(mentorSkills);
	}
	
	public List<MentorSkills> getAllDetails() {
		return mentorSkillsRepository.findAll();
	}
	
	public List<MentorSkills> searchMentor(String technolgyName) {
		return mentorSkillsRepository.findByTechnologies(technolgyName);
	}
}
