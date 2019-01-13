package com.project.cpeup.common.controller;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cpeup.common.utils.UserLoginUtil;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/403")
	public String error403() {
		String username = UserLoginUtil.getUsername();
		Collection<? extends GrantedAuthority> role = UserLoginUtil.getRole();
		return "Error : 403 ! Username : " + username + " Role : " + role.toString();
	}

}
