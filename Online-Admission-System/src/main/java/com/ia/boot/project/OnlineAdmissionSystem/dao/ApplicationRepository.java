package com.ia.boot.project.OnlineAdmissionSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ia.boot.project.OnlineAdmissionSystem.model.Application;
import com.ia.boot.project.OnlineAdmissionSystem.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {

	@Query("SELECT e FROM Application e WHERE e.courseId = :courseId AND e.status = 'Approved'")
	List<Application> viewEnrolledStudents(@Param("courseId") int courseId);

}
