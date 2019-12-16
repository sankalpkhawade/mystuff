package com.cts.registration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.registration.service.model.MentorDetails;
import com.cts.registration.service.repository.MentorDetailsRepository;

@Service
public class MentorDetailsService {

	@Autowired
	MentorDetailsRepository mentorDetailsRepository;

	public void saveMentorDetails(MentorDetails mentorDetails) {
		mentorDetailsRepository.save(mentorDetails);
	}

	public MentorDetails findByUserName(String userName) {
		return mentorDetailsRepository.findByUserName(userName);
	}
	
	public void addMentorDetails(MentorDetails mentorDetails) {
		MentorDetails oldMentorDetails = mentorDetailsRepository.findByUserName(mentorDetails.getUserName());
		if(oldMentorDetails != null) {
			oldMentorDetails.setMentorSkills(mentorDetails.getMentorSkills());
			mentorDetailsRepository.save(oldMentorDetails);
		}
	}
}
