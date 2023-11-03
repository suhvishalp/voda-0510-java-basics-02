package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.demo.dto.LoginDto;

@Service
public class AuthService {

	@Autowired
	private AuthenticationManager authenticationManager;

	public String login(LoginDto loginDto) {
		

		UsernamePasswordAuthenticationToken authReq = new UsernamePasswordAuthenticationToken(
				loginDto.getUsernameOrEmail(), loginDto.getPassword());

		Authentication authentication = authenticationManager.authenticate(authReq);

		SecurityContextHolder.getContext().setAuthentication(authentication);

		return "User logged in successfully";

	}

}
