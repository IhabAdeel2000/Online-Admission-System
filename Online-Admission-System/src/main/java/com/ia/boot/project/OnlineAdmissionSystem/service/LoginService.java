package com.ia.boot.project.OnlineAdmissionSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.boot.project.OnlineAdmissionSystem.dao.LoginRepository;
import com.ia.boot.project.OnlineAdmissionSystem.model.Login;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
//	Checks if the user logging in belongs to 'admin' or 'student' role
	public String checkLogin(Login userDetails) {
		String role = loginRepository.fetchUser(userDetails.getUsername(), userDetails.getPassword());
		if(role.equals("admin")) {
			return "Admin logged in";
		}else if(role.equals("student")) {
			return "Student logged in";
		}else {
			return "Unknown user";
		}
	}
}
