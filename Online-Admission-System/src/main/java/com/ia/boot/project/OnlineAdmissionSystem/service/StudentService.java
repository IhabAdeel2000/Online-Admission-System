package com.ia.boot.project.OnlineAdmissionSystem.service;

import java.util.List;
import java.util.Optional;

import com.ia.boot.project.OnlineAdmissionSystem.dao.ApplicationRepository;
import com.ia.boot.project.OnlineAdmissionSystem.exceptions.CourseNotFoundException;
import com.ia.boot.project.OnlineAdmissionSystem.exceptions.StudentNotFoundException;
import com.ia.boot.project.OnlineAdmissionSystem.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.boot.project.OnlineAdmissionSystem.dao.StudentRepository;
import com.ia.boot.project.OnlineAdmissionSystem.dao.CourseRepository;
import com.ia.boot.project.OnlineAdmissionSystem.model.Course;
import com.ia.boot.project.OnlineAdmissionSystem.model.Student;

@Service
public class StudentService {
	
	@Autowired
	ApplicationRepository applicationRepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	CourseRepository courseRepository;

// Apply for a course
	public void applyForCourse(int cID, int sID) throws CourseNotFoundException, StudentNotFoundException {
		Application app = new Application();
		app.setCourseId(cID);
		app.setStudentId(sID);

		if(!courseRepository.existsById(cID))
			throw new CourseNotFoundException();

		if (!studentRepository.existsById(sID))
			throw new StudentNotFoundException();

		applicationRepository.save(app);
	}
}

