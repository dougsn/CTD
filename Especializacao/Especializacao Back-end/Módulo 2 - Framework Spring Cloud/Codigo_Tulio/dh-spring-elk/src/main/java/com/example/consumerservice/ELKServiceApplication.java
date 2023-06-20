package com.example.consumerservice;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
public class ELKServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ELKServiceApplication.class, args);
	}
}

@RestController
class ELKService {

	private static final Logger LOG = Logger.getLogger(ELKService.class.getName());


	@RequestMapping(method = RequestMethod.GET, path ="example")
	public Map<String, String> message() {
		Map<String, String> response = new HashMap<>();

		LOG.info("example log");
		return response;
	}

	@RequestMapping(method = RequestMethod.GET, path ="exception")
	public Map<String, String> exception() {
		Map<String, String> response = new HashMap<>();

		try{
			throw new IllegalArgumentException("logstash- excepcion generada en path /exception");
		}catch (RuntimeException e){
			LOG.error("logstash exception", e);
		}

		LOG.info("example log");
		return response;
	}

	@RequestMapping(method = RequestMethod.GET, path ="teste")
	public Map<String, String> teste() {
		Map<String, String> response = new HashMap<>();

		try{
			throw new IllegalArgumentException("teste- excepcion generada en path /exception");
		}catch (RuntimeException e){
			LOG.error("test exception", e);
		}

		LOG.info("example log");
		return response;
	}
}
