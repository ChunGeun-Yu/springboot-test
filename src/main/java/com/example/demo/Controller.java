package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/")
	public String get() {
		System.out.println("get...");
		return "{\"id\": \"1234567890\"}";			
	}
	
	@GetMapping("/api1")
	public String api1() {
		System.out.println("get...");
		return "{\"id\": \"api1\"}";			
	}
	
	@GetMapping("/api2")
	public String api2() {
		System.out.println("get...");
		return "{\"id\": \"api2\"}";			
	}
	
	@GetMapping("/api3")
	public String api3() {
		System.out.println("get...");
		return "{\"id\": \"get_api3\"}";			
	}
	
	@PostMapping("/api3")
	public String postApi3() {
		System.out.println("post...");
		return "{\"id\": \"post_api3\"}";			
	}
}
