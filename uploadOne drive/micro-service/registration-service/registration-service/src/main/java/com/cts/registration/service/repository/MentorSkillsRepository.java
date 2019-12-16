package com.cts.registration.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.registration.service.model.MentorSkills;

public interface MentorSkillsRepository extends JpaRepository<MentorSkills, String> {

	MentorSkills findByFacilities(String string);

}
