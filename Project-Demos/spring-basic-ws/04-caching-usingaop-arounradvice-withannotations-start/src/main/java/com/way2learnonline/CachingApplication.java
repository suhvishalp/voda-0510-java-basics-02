package com.way2learnonline;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

	@Configuration
	@EnableAspectJAutoProxy
	@ComponentScan(basePackages={"com.way2learnonline"})
	public class CachingApplication {
	
	}
	
	
