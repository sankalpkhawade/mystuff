package com.cts.search.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.search.service.model.MentorSkills;

public interface MentorSkillsRepository extends JpaRepository<MentorSkills, String> {

	@Query(nativeQuery = true, value = "select * from mentor_skill ms join technology t on ms.ms_t_id=t.t_id where t_name=?1 or t_name like %?1%")
	List<MentorSkills> findByTechnologies(String technologyName);
}
