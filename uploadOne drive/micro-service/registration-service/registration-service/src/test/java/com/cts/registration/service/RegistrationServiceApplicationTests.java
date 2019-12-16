package com.cts.registration.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.LinkedHashSet;
import java.util.Set;

import com.cts.registration.service.model.MentorDetails;
import com.cts.registration.service.model.MentorSkills;
import com.cts.registration.service.model.StudentDetails;
import com.cts.registration.service.model.Technology;
import com.cts.registration.service.model.User;
import com.cts.registration.service.repository.MentorDetailsRepository;
import com.cts.registration.service.repository.MentorSkillsRepository;
import com.cts.registration.service.repository.StudentDetailsRepository;
import com.cts.registration.service.repository.TechnologyRepositry;
import com.cts.registration.service.repository.UserRepository;
import com.cts.registration.service.service.MentorDetailsService;
import com.cts.registration.service.service.MentorSkillsService;
import com.cts.registration.service.service.StudentDetailsService;
import com.cts.registration.service.service.TechnologyService;
import com.cts.registration.service.service.UserService;

@SpringBootTest
public class RegistrationServiceApplicationTests {

	@InjectMocks
	UserService userService;

	@InjectMocks
	MentorDetailsService mentorService;

	@InjectMocks
	StudentDetailsService studentdetailservice;

	@InjectMocks
	MentorSkillsService mentorSkillsService;

	@InjectMocks
	TechnologyService technologyService;

	@Mock
	UserRepository userRepository;

	@Mock
	MentorDetailsRepository mentorDetailsRepository;

	@Mock
	StudentDetailsRepository studentDetailsRepository;

	@Mock
	MentorSkillsRepository mentorSkillsRepository;

	@Mock
	TechnologyRepositry technologyRepositry;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testUserServiceName() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByName("Sankalp Khawade")).thenReturn(user);
		User testUser = userRepository.findByName("Sankalp Khawade");
		assertEquals("Sankalp Khawade", testUser.getName());
	}

	@Test
	public void testUserServiceNameFailure() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByName("Sankalp Khawade")).thenReturn(user);
		User testUser = userRepository.findByName("Sankalp Khawade");
		assertEquals("Sankalp Khawade", testUser.getName());
	}

	@Test
	public void testUserServiceEmail() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByEmail("lonavala@pune.com")).thenReturn(user);
		User testUser = userRepository.findByEmail("lonavala@pune.com");
		assertEquals("lonavala@pune.com", testUser.getEmail());
	}

	@Test
	public void testUserServiceEmailFailure() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByEmail("lonavala@pune.com")).thenReturn(user);
		User testUser = userRepository.findByEmail("lonavala@pune.com");
		assertEquals("lonavala@pune.com", testUser.getEmail());
	}

	@Test
	public void testStudentDetailService() {
		StudentDetails student = new StudentDetails();
		student.setUserName("Hello");
		student.setEmail("hello@gmail.com");
		student.setPassword("hello");
		student.setFirstName("hello");
		student.setLastName("hi");
		student.setContact("8978799788");

		when(studentDetailsRepository.findByUserName("Sankalp Khawade")).thenReturn(student);
		StudentDetails testStudent = studentDetailsRepository.findByUserName("Sankalp Khawade");
		assertEquals("Hello", testStudent.getUserName());
		assertEquals("hello", testStudent.getFirstName());
		assertEquals("hi", testStudent.getLastName());
		assertEquals("hello@gmail.com", testStudent.getEmail());
		assertEquals("hello", testStudent.getPassword());
		assertEquals("8978799788", testStudent.getContact());
	}

	@Test
	public void testMentorDetails() {
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

		mentordetails.setMentorSkills(setmentorskills);

		when(mentorDetailsRepository.findByUserName("Hello")).thenReturn(mentordetails);
		MentorDetails testmentordetails = mentorDetailsRepository.findByUserName("Hello");
		assertEquals("Hello", testmentordetails.getUserName());
	}

	@Test
	public void testMentorSkills() {
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

		mentordetails.setMentorSkills(setmentorskills);
		mentorSkillsService.saveSkills(mentorskills);

		when(mentorSkillsRepository.findByFacilities("Have it")).thenReturn(mentorskills);
		MentorSkills testmentorskills = mentorSkillsRepository.findByFacilities("Have it");

		assertEquals("Have it", testmentorskills.getFacilities());
	}

	@Test
	public void testTechnology() {
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

		mentordetails.setMentorSkills(setmentorskills);

		when(technologyRepositry.findByName("SAP")).thenReturn(technology);
		Technology testTechnology = technologyRepositry.findByName("SAP");
		assertEquals("SAP", testTechnology.getName());
	}
}
