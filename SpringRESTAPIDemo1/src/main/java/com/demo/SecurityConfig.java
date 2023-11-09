package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	public SecurityConfig() {
		super();
	}

	@Bean
	private static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		
		return configuration.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
			.authorizeHttpRequests( (authorize) -> authorize
//					.requestMatchers(HttpMethod.GET, "/api/posts/**").permitAll()
					.requestMatchers("/actuator/**").permitAll()
					.requestMatchers(HttpMethod.POST, "/api/auth/**").permitAll()
					.anyRequest().authenticated()
						
				)
			
			.httpBasic(Customizer.withDefaults());
		
			
		
		return http.build();		//DefaultSecurityFilterChain
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails user1 = User.builder()
//									.username("admin")
//									.password(passwordEncoder().encode("admin"))
//									.roles("ADMIN")
//									.build();
//		
//		UserDetails user2 = User.builder()
//				.username("abc")
//				.password(passwordEncoder().encode("abc"))
//				.roles("GUEST")
//				.build();
//		
//		return new InMemoryUserDetailsManager(user1, user2);
//		
//	}
//	
}
