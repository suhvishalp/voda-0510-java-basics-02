package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.LoginDto;
import com.demo.services.AuthService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
		
		String response = authService.login(loginDto);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
