package com.ia.boot.project.OnlineAdmissionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ia.boot.project.OnlineAdmissionSystem.dao.ApplicationRepository;
import com.ia.boot.project.OnlineAdmissionSystem.exceptions.StatusException;
import com.ia.boot.project.OnlineAdmissionSystem.model.Application;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
	@Autowired
	ApplicationRepository applicationRepository;

// View all applications	
	public List<Application> viewApplications() {
		return applicationRepository.findAll();
	}
	
//Update Status
	public Application updateStatus(Application application) {
		try {
			if(application.getStatus().equals("Approved") || application.getStatus().equals("Declined")) {
				Application statusChange = applicationRepository.findById(application.getApplicationId()).get();
				statusChange.setStatus(application.getStatus());
				applicationRepository.save(statusChange);
				return statusChange;
			}else {
				throw new StatusException();
			}
		}catch(StatusException e) {
			e.invalidStatus();
			return null;
		}
	}
	
// View all students enrolled to a specific course
	public List<Application> viewCourseStudents(int id) {
		return applicationRepository.viewEnrolledStudents(id);
	}
}