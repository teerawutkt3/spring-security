package com.project.cpeup.controller;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cpeup.common.utils.UserLoginUtil;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/all")
	public String all() {
		return "All";
	}

	@GetMapping("/user")
	public String user() {
		String username = UserLoginUtil.getUsername();		
		Collection<? extends GrantedAuthority> role = UserLoginUtil.getRole();
		return "Username : " + username + " Role : " + role.toString();
	}

	@GetMapping("/admin")
	public String admin() {
		String username = UserLoginUtil.getUsername();		
		Collection<? extends GrantedAuthority> role = UserLoginUtil.getRole();
		return "Username : " + username + " Role : " + role.toString();
	}
		
}
