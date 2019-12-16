package com.cts.search.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.search.service.model.MentorDetails;

public interface MentorDetailsRepository extends JpaRepository<MentorDetails, String> {

	MentorDetails findByUserName(String userName);
}
