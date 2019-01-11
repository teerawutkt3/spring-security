package com.project.cpeup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/all")
	public String a() {
		return "A";
	}

	@GetMapping("/user")
	public String user() {
		return "user role";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin role";
	}
}
