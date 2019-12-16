package com.cts.technology.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.cts.technology.service.model.Technology;
import com.cts.technology.service.repository.TechnologyRepositry;
import com.cts.technology.service.service.TechnologyService;

@SpringBootTest
public class TechnologyServiceApplicationTests {
	@InjectMocks
	TechnologyService technologyService;

	@Mock
	TechnologyRepositry technologyRepositry;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testsave() {
		Technology technology = new Technology();
		technology.setId(1);
		technology.setDuration(2);
		technology.setName("SAP");
		technology.setPrerequisites("Books");
		technologyService.saveTechnology(technology);

		when(technologyRepositry.findByName("SAP")).thenReturn(technology);
		Technology testTech = technologyRepositry.findByName("SAP");
		assertEquals("SAP", testTech.getName());
	}
	
	@Test
	public void testgetTechnology() {
		Technology technology = new Technology();
		technology.setId(1);
		technology.setDuration(2);
		technology.setName("SAP");
		technology.setPrerequisites("Books");
		// technologyService.saveTechnology(technology);

		when(technologyRepositry.findByName("SAP")).thenReturn(technology);
		Technology testTech = technologyRepositry.findByName("SAP");
		assertEquals("SAP", testTech.getName());
		assertEquals("Books", testTech.getPrerequisites());
	}

	@Test
	public void testgetAllTechnology() {
		Technology technology = new Technology();
		technology.setId(1);
		technology.setDuration(2);
		technology.setName("SAP");
		technology.setPrerequisites("Books");

		List<Technology> listtechnology = new ArrayList<>();
		listtechnology.add(technology);

		when(technologyRepositry.findAll()).thenReturn(listtechnology);
		List<Technology> testTech = technologyRepositry.findAll();

		for (Technology tech : testTech) {
			assertEquals("SAP", tech.getName());
			assertEquals("Books", tech.getPrerequisites());
		}
	}
	
//	@Test
//	public void testdelete() {
//		Technology technology = new Technology();
//		technology.setId(1);
//		technology.setDuration(2);
//		technology.setName("SAP");
//		technology.setPrerequisites("Books");
//		technologyService.deleteTechnology(technology.getName());
//		
//
//		when(technologyRepositry.findByName("SAP")).thenReturn(technology);
//		Technology testTech = technologyRepositry.findByName("SAP");
//		assertEquals("SAP", testTech.getName());
//	}
}
