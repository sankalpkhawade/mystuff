package com.cts.registration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registration.service.model.StudentDetails;
import com.cts.registration.service.repository.StudentDetailsRepository;

@Service
public class StudentDetailsService {

	@Autowired
	StudentDetailsRepository studentDetailsRepository;
	
	public void registration(StudentDetails studentDetails) {
		studentDetailsRepository.save(studentDetails);
	}
	
	public StudentDetails findByUserName(String userName) {
		return studentDetailsRepository.findByUserName(userName);
	}
}
