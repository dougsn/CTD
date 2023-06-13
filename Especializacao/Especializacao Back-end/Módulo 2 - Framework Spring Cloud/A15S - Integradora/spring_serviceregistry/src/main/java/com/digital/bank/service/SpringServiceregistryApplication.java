package com.digital.bank.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringServiceregistryApplication {

	public static void main (String[] args) {
		SpringApplication.run(SpringServiceregistryApplication.class, args);
	}

}
