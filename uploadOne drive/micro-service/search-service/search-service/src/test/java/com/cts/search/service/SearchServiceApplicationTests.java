package com.cts.search.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.search.service.model.MentorDetails;
import com.cts.search.service.model.MentorSkills;
import com.cts.search.service.model.Technology;
import com.cts.search.service.repository.MentorSkillsRepository;
import com.cts.search.service.repository.TechnologyRepositry;
import com.cts.search.service.service.MentorSkillsService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
public class SearchServiceApplicationTests {

	@InjectMocks
	MentorSkillsService mentorSkillsService;

	@Mock
	MentorSkillsRepository mentorSkillsRepository;

	@Mock
	TechnologyRepositry technologyRepositry;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testsaveskills() {
		MentorDetails mentordetails = new MentorDetails();
		mentordetails.setId(1);
		mentordetails.setUserName("Hello");
		mentordetails.setEmail("hello@gmail.com");
		mentordetails.setPassword("hello");
		mentordetails.setFirstName("hello");
		mentordetails.setLastName("hi");
		mentordetails.setContact("8978799788");
		mentordetails.setExperience(4);
		mentordetails.setActive("false");
		mentordetails.setLinkedInUrl("http://linkedin.com");

		MentorSkills mentorskills = new MentorSkills();
		mentorskills.setId(1);
		mentorskills.setMentorDetails(mentordetails);
		mentorskills.setFacilities("Have it");
		mentorskills.setExperience(2);
		mentorskills.setRating(9);
		mentorskills.setTrainings(25);

		Technology technology = new Technology();
		technology.setId(1);
		technology.setDuration(2);
		technology.setName("SAP");
		technology.setPrerequisites("Books");

		mentorskills.setTechnologies(technology);

		Set<MentorSkills> setmentorskills = new LinkedHashSet<>();
		setmentorskills.add(mentorskills);

		technology.setMentorSkills(setmentorskills);
		mentorSkillsService.saveSkills(mentorskills);

		when(mentorSkillsRepository.save(mentorskills)).thenReturn(mentorskills);
		MentorSkills testmentorskills = mentorSkillsRepository.save(mentorskills);
		assertEquals("Have it", testmentorskills.getFacilities());
	}

	@Test
	public void testgetAllDetails() {
		
		MentorDetails mentordetails = new MentorDetails();
		mentordetails.setId(1);
		mentordetails.setUserName("Hello");
		mentordetails.setEmail("hello@gmail.com");
		mentordetails.setPassword("hello");
		mentordetails.setFirstName("hello");
		mentordetails.setLastName("hi");
		mentordetails.setContact("8978799788");
		mentordetails.setExperience(4);
		mentordetails.setActive("false");
		mentordetails.setLinkedInUrl("http://linkedin.com");

		MentorSkills mentorskills = new MentorSkills();
		mentorskills.setId(1);
		mentorskills.setMentorDetails(mentordetails);
		mentorskills.setFacilities("Have it");
		mentorskills.setExperience(2);
		mentorskills.setRating(9);
		mentorskills.setTrainings(25);

		Technology technology = new Technology();
		technology.setId(1);
		technology.setDuration(2);
		technology.setName("SAP");
		technology.setPrerequisites("Books");

		mentorskills.setTechnologies(technology);

		Set<MentorSkills> setmentorskills = new LinkedHashSet<>();
		List<MentorSkills> listmentorskills = new ArrayList<>();
		setmentorskills.add(mentorskills);
		listmentorskills.add(mentorskills);
		
		technology.setMentorSkills(setmentorskills);

		when(mentorSkillsRepository.findAll()).thenReturn(listmentorskills);
		List<MentorSkills> testmentorskills = mentorSkillsRepository.findAll();
		
		for (MentorSkills skills : testmentorskills) {
			assertEquals("Have it", skills.getFacilities());
		}
	}
	@Test
	public void testsearch() {
		
		MentorDetails mentordetails = new MentorDetails();
		mentordetails.setId(1);
		mentordetails.setUserName("Hello");
		mentordetails.setEmail("hello@gmail.com");
		mentordetails.setPassword("hello");
		mentordetails.setFirstName("hello");
		mentordetails.setLastName("hi");
		mentordetails.setContact("8978799788");
		mentordetails.setExperience(4);
		mentordetails.setActive("false");
		mentordetails.setLinkedInUrl("http://linkedin.com");

		MentorSkills mentorskills = new MentorSkills();
		mentorskills.setId(1);
		mentorskills.setMentorDetails(mentordetails);
		mentorskills.setFacilities("Have it");
		mentorskills.setExperience(2);
		mentorskills.setRating(9);
		mentorskills.setTrainings(25);

		Technology technology = new Technology();
		technology.setId(1);
		technology.setDuration(2);
		technology.setName("SAP");
		technology.setPrerequisites("Books");

		mentorskills.setTechnologies(technology);

		Set<MentorSkills> setmentorskills = new LinkedHashSet<>();
		List<MentorSkills> listmentorskills = new ArrayList<>();
		setmentorskills.add(mentorskills);
		listmentorskills.add(mentorskills);
		
		technology.setMentorSkills(setmentorskills);

		when(mentorSkillsRepository.findByTechnologies("S")).thenReturn(listmentorskills);
		List<MentorSkills> testmentorskills = mentorSkillsRepository.findByTechnologies("S");
		
		for (MentorSkills skills : testmentorskills) {
			assertEquals("SAP", skills.getTechnologies().getName());
		}
		
	}
}
