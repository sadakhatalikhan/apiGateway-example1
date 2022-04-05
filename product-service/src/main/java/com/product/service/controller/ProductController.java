package com.product.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@GetMapping("/home")
	public String createProduct() {
		return "Product created";
	}
	
	@GetMapping("/user")
	public String createUserProduct() {
		return "User Product created";
	}
	
	@GetMapping("/admin")
	public String createAdminProduct() {
		return "AdminProduct created";
	}
	
}
