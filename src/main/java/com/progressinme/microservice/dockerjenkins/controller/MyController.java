package com.progressinme.microservice.dockerjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test-docker-jenkins")
	public String getData() {
		return "In Docker Jenkins Tutorial";
	}
}
