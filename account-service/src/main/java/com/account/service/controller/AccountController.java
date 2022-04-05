package com.account.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {
	
	@GetMapping("/home")
	public String createAccount() {
		return "Account created";
	}
	
	@GetMapping("/user")
	public String createUserAccount() {
		return "User Account created";
	}
	
	@GetMapping("/admin")
	public String createAdminAccount() {
		return "Admin Account created";
	}
	
}
