package com.project.cpeup.common.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.cpeup.common.repository.UserRepository;

@Service
public class UserDetailsServiceCustom implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.project.cpeup.common.entities.User user = userRepository.findByUsername(username);
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		SimpleGrantedAuthority roleAmin = new SimpleGrantedAuthority("ADMIN");
		authorities.add(roleAmin);
		return new User(user.getUsername(), "{noop}" + user.getPassword(), authorities);
	}

}
