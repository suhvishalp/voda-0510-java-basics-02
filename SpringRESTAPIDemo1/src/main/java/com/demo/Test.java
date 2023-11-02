package com.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("vishal"));
		System.out.println(encoder.encode("mohit"));

	}

}
