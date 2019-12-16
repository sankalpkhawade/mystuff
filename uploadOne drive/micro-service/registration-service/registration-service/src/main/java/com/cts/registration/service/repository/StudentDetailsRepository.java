package com.cts.registration.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.registration.service.model.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, String> {

	StudentDetails findByUserName(String userName);
}
