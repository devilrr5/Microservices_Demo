package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Welcome-Service")///using this for feing client communicate  || the name is use from eureka server
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg();

}
