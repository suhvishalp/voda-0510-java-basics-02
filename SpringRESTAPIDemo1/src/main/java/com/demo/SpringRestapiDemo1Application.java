package com.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRestapiDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestapiDemo1Application.class, args);
	}

	
	@Bean
	public ModelMapper createModelMapper() {
		return new ModelMapper();
	}
}
