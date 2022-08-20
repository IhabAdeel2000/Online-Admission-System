package com.ia.boot.project.OnlineAdmissionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.boot.project.OnlineAdmissionSystem.dao.CourseRepository;
import com.ia.boot.project.OnlineAdmissionSystem.model.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> viewAllCourses() {
		return courseRepository.findAll();
	}

	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	public Course editCourse(Course courseToUpdate) {
		Course courseAfterUpdate = courseRepository.findById(courseToUpdate.getCourseId()).get();
		courseAfterUpdate.setCourseId(courseToUpdate.getCourseId());
		courseAfterUpdate.setCourseTitle(courseToUpdate.getCourseTitle());
		courseAfterUpdate.setCourseDuration(courseToUpdate.getCourseDuration());
		courseAfterUpdate.setCourseCredits(courseToUpdate.getCourseCredits());
		courseAfterUpdate.setCourseCode(courseToUpdate.getCourseCode());
		courseRepository.save(courseAfterUpdate);
		return courseAfterUpdate;
	}

	public void deleteCourse(int courseId) {
		courseRepository.deleteById(courseId);
		return;
	}

	public Optional<Course> viewCourse(int courseId) {
		return courseRepository.findById(courseId);
	}
}
