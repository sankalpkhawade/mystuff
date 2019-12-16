package com.cts.registration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registration.service.model.MentorSkills;
import com.cts.registration.service.repository.MentorSkillsRepository;

@Service
public class MentorSkillsService {

	@Autowired
	MentorSkillsRepository mentorSkillsRepository;
	
	public void saveSkills(MentorSkills mentorSkills) {
		mentorSkillsRepository.save(mentorSkills);
	}
}
