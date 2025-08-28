package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String showUsers() {
		return "Hello Your Application is Running fine using Docker!";
	}

	
	

}
