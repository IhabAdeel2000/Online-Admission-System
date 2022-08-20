package com.ia.boot.project.OnlineAdmissionSystem.controller;

import java.util.List;
import java.util.Optional;

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

import com.ia.boot.project.OnlineAdmissionSystem.model.Course;
import com.ia.boot.project.OnlineAdmissionSystem.service.CourseService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	
	@Autowired
	CourseService courseService;
	
//	View all courses
	@GetMapping("/courses")
	public List<Course> viewAllCourses() {
		return courseService.viewAllCourses();
	}
	
//	Add a course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
//	Edit a course
	@PutMapping("/courses")
	public Course editCourse(@RequestBody Course course) {
		return courseService.editCourse(course);
	}
	
//	Delete a course
	@DeleteMapping("/courses")
	public void deleteCourse(@RequestParam("id") int id) {
		courseService.deleteCourse(id);
		return;
	}
	
//	Get a specific course
	@GetMapping("/courses/{id}")
	public Optional<Course> viewCourse(@PathVariable int id) {
		return courseService.viewCourse(id);
	}
	
//	Get all applications pending approval
	@GetMapping("/courses/enrollments")
	public List<Application> viewAllApplications() {
		return applicationService.viewAllApplications();
	}
	
//	Approve an application
	@PutMapping("/courses/enrollments/approve")
	public void approveApplication(@RequestParam("id") int id) {
		applicationService.approveApplication(id);
	}
	
//	Decline an application
	@PutMapping("/courses/enrollments/decline")
	public void declineApplication(@RequestParam("id") int id) {
		applicationService.declineApplication(id);
	}
	
//	View all students enrolled to a course
	@GetMapping("/courses/enrollments/course")
	public List<Application> viewCourseStudents(@RequestParam("id") int id) {
		return applicationService.viewCourseStudents(id);
	}
}
