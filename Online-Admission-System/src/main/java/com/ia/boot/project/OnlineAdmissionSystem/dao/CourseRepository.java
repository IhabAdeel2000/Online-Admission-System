package com.ia.boot.project.OnlineAdmissionSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ia.boot.project.OnlineAdmissionSystem.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
