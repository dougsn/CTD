package com.digital.bank.apigateway.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

	@CircuitBreaker (name = "apigateway")
	@GetMapping ("/usuarioFallback")
	public ResponseEntity<String> orderServiceFallback () {
		return new ResponseEntity<>("Servidor instável. Por favor, contate o suporte.",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@CircuitBreaker (name = "estoque")
	@GetMapping ("/estoqueFallback")
	public ResponseEntity<String> estoqueServiceFallback () {
		return new ResponseEntity<>("Servidor instável. Por favor, contate o suporte.",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@CircuitBreaker (name = "repositorio")
	@GetMapping ("/repositorioFallback")
	public ResponseEntity<String> repositorioServiceFallback () {
		return new ResponseEntity<>("Servidor instável. Por favor, contate o suporte.",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}