package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welcomeClient;
	
	@GetMapping("/greet")
	public String getgreetMsg() {
		
		String welcomeMsg=welcomeClient.getWelcomeMsg();
		String greetMsg = "Good Morning";
		return greetMsg+ welcomeMsg;
	}

}
