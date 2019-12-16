package com.cts.registration.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.registration.service.model.MentorDetails;

public interface MentorDetailsRepository extends JpaRepository<MentorDetails, String> {

	MentorDetails findByUserName(String userName);
}
