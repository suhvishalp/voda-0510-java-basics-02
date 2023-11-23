package com.demo.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.dto.LoginDto;
import com.demo.dto.RegisterDto;
import com.demo.entities.Role;
import com.demo.entities.User;
import com.demo.exceptions.BlogAPIException;
import com.demo.repositories.RoleRepository;
import com.demo.repositories.UserRepository;

@Service
public class AuthService {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public String login(LoginDto loginDto) {
		

		UsernamePasswordAuthenticationToken authReq = new UsernamePasswordAuthenticationToken(
				loginDto.getUsernameOrEmail(), loginDto.getPassword());

		Authentication authentication = authenticationManager.authenticate(authReq);

		SecurityContextHolder.getContext().setAuthentication(authentication);

		return "User logged in successfully";

	}

	
	public String register(RegisterDto registerDto) {
		
		if(userRepository.existsByName(registerDto.getUsername())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Username is already exists");
		}
		
		if(userRepository.existsByEmail(registerDto.getEmail())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Username is already exists");
		}
		
		User user = new User();
		user.setName(registerDto.getName());
		user.setEmail(registerDto.getEmail());
	
		Set<Role> roles = new HashSet<>();
		Role userRole = roleRepository.findByName("ADMIN").get();
		roles.add(userRole);
		user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

		
		userRepository.save(user);
		
		//should generate an auth token and return it to the client
		
		return "User Registered successfully";
	}
}
