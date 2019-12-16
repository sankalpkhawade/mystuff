package com.cts.registration.service.controller;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.registration.service.model.MentorDetails;
import com.cts.registration.service.model.MentorSkills;
import com.cts.registration.service.model.StudentDetails;
import com.cts.registration.service.model.Technology;
import com.cts.registration.service.model.User;
import com.cts.registration.service.service.MentorDetailsService;
import com.cts.registration.service.service.MentorSkillsService;
import com.cts.registration.service.service.StudentDetailsService;
import com.cts.registration.service.service.TechnologyService;
import com.cts.registration.service.service.UserService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	MentorDetailsService mentorDetailsService;

	@Autowired
	UserService userService;

	@Autowired
	StudentDetailsService studentDetailsService;

	@Autowired
	TechnologyService technologyService;

	@Autowired
	MentorSkillsService mentorSkillsService;

	@PostMapping("/mentor")
	public boolean mentorRegistration(@Valid @RequestBody MentorDetails mentorDetails) {
		MentorDetails details = mentorDetailsService.findByUserName(mentorDetails.getUserName());
		if (details == null) {
			MentorDetails newMentor = new MentorDetails();
			newMentor.setUserName(mentorDetails.getUserName());
			newMentor.setFirstName(mentorDetails.getFirstName());
			newMentor.setLastName(mentorDetails.getLastName());
			newMentor.setEmail(mentorDetails.getEmail());
			newMentor.setPassword(passwordEncoder().encode(mentorDetails.getPassword()));
			newMentor.setContact(mentorDetails.getContact());
			newMentor.setLinkedInUrl(mentorDetails.getLinkedInUrl());
			newMentor.setExperience(mentorDetails.getExperience());
			newMentor.setActive("false");
			System.out.println("Mentor Details: " + mentorDetails);
			mentorDetailsService.saveMentorDetails(newMentor);
			User user = new User();
			user.setName(mentorDetails.getUserName());
			user.setEmail(mentorDetails.getEmail());
			user.setPassword(passwordEncoder().encode(mentorDetails.getPassword()));
			user.setRole("Mentor");
			userService.register(user);
			return true;
		}
		return false;
	}

	@PostMapping("/mentor/mentorSkills/{mentor}/{technology}")
	public boolean mentorSkillsRegistration(@RequestBody MentorSkills mentorSkills,
			@PathVariable("mentor") String userName, @PathVariable("technology") String technologyName) {
		MentorSkills newMentorSkill = new MentorSkills();
		System.out.println("Mentor Skills: " + mentorSkills);
		newMentorSkill.setRating(mentorSkills.getRating());
		newMentorSkill.setExperience(mentorSkills.getExperience());
		newMentorSkill.setFacilities(mentorSkills.getFacilities());
		newMentorSkill.setTrainings(mentorSkills.getTrainings());
		newMentorSkill.setMentorDetails(mentorDetailsService.findByUserName(userName));
		newMentorSkill.setTechnologies(technologyService.getTechnology(technologyName));
		mentorSkillsService.saveSkills(newMentorSkill);
		return true;
	}
	
	@PostMapping("/mentor/skills")
	public void mentorSkills(@RequestBody Set<MentorSkills> mentorSkillsSet) {
		System.out.println("Mentor Skills Set: "+mentorSkillsSet);
		for(MentorSkills mentorSkills : mentorSkillsSet) {
			System.out.println("Mentor Skills: "+mentorSkills);
			MentorSkills newMentorSkill = new MentorSkills();
			newMentorSkill.setRating(mentorSkills.getRating());
			newMentorSkill.setExperience(mentorSkills.getExperience());
			newMentorSkill.setFacilities(mentorSkills.getFacilities());
			newMentorSkill.setTrainings(mentorSkills.getTrainings());
			System.out.println("Mentor Details: "+mentorSkills.getMentorDetails());
			MentorDetails mentorDetails = mentorDetailsService.findByUserName(mentorSkills.getMentorDetails().getUserName());
			System.out.println("Mentor Details New: "+mentorDetails);
			newMentorSkill.setMentorDetails(mentorDetails);
			newMentorSkill.setTechnologies(mentorSkills.getTechnologies());
			mentorSkillsService.saveSkills(newMentorSkill);
		}
	}

	@GetMapping("/mentor/technology/{tech}")
	public Technology getTechnology(@PathVariable("tech") String name) {
		return technologyService.getTechnology(name);
	}

	@PostMapping("/student")
	public boolean studentRegistration(@RequestBody StudentDetails studentDetails) {
		StudentDetails details = studentDetailsService.findByUserName(studentDetails.getUserName());
		if (details == null) {
			StudentDetails newStudent = new StudentDetails();
			newStudent.setUserName(studentDetails.getUserName());
			newStudent.setFirstName(studentDetails.getFirstName());
			newStudent.setLastName(studentDetails.getLastName());
			newStudent.setEmail(studentDetails.getEmail());
			newStudent.setPassword(passwordEncoder().encode(studentDetails.getPassword()));
			newStudent.setContact(studentDetails.getContact());
			studentDetailsService.registration(newStudent);
			User user = new User();
			user.setName(studentDetails.getUserName());
			user.setEmail(studentDetails.getEmail());
			user.setPassword(passwordEncoder().encode(studentDetails.getPassword()));
			user.setRole("Student");
			userService.register(user);
			return true;
		}
		return false;
	}

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
