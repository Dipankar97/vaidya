package com.vaidya.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping(value = "/vaidya")
public class HealthCheckController {

	@GetMapping(value = "/health-check")
	public ResponseEntity<String> healthCheck() {

		log.info("Vaidya User Service is up and running ...");	
		return new ResponseEntity<>("Vaidya User Service is up and running ...", HttpStatus.OK);
	}
}
