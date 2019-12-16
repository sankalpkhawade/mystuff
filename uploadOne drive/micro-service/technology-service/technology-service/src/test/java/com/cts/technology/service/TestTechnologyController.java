package com.cts.technology.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cts.technology.service.controller.TechnologyController;

@RunWith(SpringRunner.class)
@WebMvcTest(TechnologyController.class)
public class TestTechnologyController {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getAllEmployeesAPI() throws Exception 
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/technology")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.technology").exists())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.technology[*].id").isNotEmpty());
	}
}
