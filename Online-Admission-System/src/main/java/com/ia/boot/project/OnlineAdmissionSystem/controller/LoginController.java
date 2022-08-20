package com.ia.boot.project.OnlineAdmissionSystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.boot.project.OnlineAdmissionSystem.model.Login;
import com.ia.boot.project.OnlineAdmissionSystem.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@PostMapping("/login")
	public String login(@RequestBody Login userDetails) {
		return loginService.checkLogin(userDetails);
	}
}
