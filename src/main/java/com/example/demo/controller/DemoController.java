package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/demo/api")
public class DemoController {
	
	@GetMapping("/welcome")
	public String getMethodName() {
		return "welcome to demo application";
	}
	
	@GetMapping("/greeting")
	public String greetingMethod() {
		return "greetings";
		
	}
	@GetMapping("/hello")
	public String helloMethod() {
		return "Hello";
		
	}
	
	

}
