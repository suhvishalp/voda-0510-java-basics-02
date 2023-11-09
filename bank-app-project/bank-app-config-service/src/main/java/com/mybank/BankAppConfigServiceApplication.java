package com.mybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BankAppConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppConfigServiceApplication.class, args);
	}

}
