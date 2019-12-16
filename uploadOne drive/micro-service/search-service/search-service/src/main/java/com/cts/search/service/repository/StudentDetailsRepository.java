package com.cts.search.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.search.service.model.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, String> {

	StudentDetails findByUserName(String userName);
}
