package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	//GET 		http://localhost:8080/hello
	
	@GetMapping("/hello")
	public String sayHello() {					//handler method 
		return "helloworld! This is some data returned from the server";
	}
	
}
