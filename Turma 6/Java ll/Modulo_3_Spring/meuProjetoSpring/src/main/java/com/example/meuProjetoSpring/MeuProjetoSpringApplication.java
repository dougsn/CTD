package com.example.meuProjetoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MeuProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuProjetoSpringApplication.class, args);
	}

	@GetMapping
	public String olaMundo(){
		return "Olá Mundo";
	}

}
