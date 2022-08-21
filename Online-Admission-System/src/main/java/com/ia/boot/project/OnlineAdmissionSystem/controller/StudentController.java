package com.ia.boot.project.OnlineAdmissionSystem.controller;
import java.util.List;
import java.util.Optional;

import com.ia.boot.project.OnlineAdmissionSystem.exceptions.CourseNotFoundException;
import com.ia.boot.project.OnlineAdmissionSystem.exceptions.StudentNotFoundException;
import com.ia.boot.project.OnlineAdmissionSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ia.boot.project.OnlineAdmissionSystem.model.Application;
import com.ia.boot.project.OnlineAdmissionSystem.model.Course;
import com.ia.boot.project.OnlineAdmissionSystem.service.ApplicationService;
import com.ia.boot.project.OnlineAdmissionSystem.service.CourseService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	CourseService courseService;
	
	@Autowired
	ApplicationService applicationService;
	
	@Autowired
	StudentService studentService;

//	View all courses
	@GetMapping("/courses")
	public List<Course> viewAllCourses() {
		return courseService.viewAllCourses();
	}

//	Get a specific course
	@GetMapping("/courses/{id}")
	public Optional<Course> viewCourse(@PathVariable int id) {
		return courseService.viewCourse(id);
	}

//  Apply for a course 
	@PostMapping("/enrollments/applications")
	public void applyForCourse(@RequestParam("cID") int cID, @RequestParam("sID") int sID){
		try{
			studentService.applyForCourse(cID, sID);
		}catch(CourseNotFoundException e) {
			e.courseNotFound();
		}catch(StudentNotFoundException e) {
			e.studentNotFound();
		}
	}
}