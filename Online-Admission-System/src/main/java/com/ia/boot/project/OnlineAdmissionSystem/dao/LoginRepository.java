package com.ia.boot.project.OnlineAdmissionSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ia.boot.project.OnlineAdmissionSystem.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

	@Query("SELECT role FROM Login u WHERE u.username = :username AND u.password = :password")
	String fetchUser(@Param("username") String username, @Param("password") String password);
}
