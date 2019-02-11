package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	@RequestMapping("/createNewUser")
	public String createNewUser() {
		return "createNewUser";
	}

	@RequestMapping("/manageUsers")
	public String manageUsers() {
		return "manageUsers";
	}
	
	@RequestMapping("/createTask")
	public String createTask() {
		return "createTask";
	}
	
}
