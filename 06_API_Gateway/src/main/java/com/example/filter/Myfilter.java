package com.example.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class Myfilter implements GlobalFilter {
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
		System.out.println("filter() -executed....");
		//todo 
		
		
		return chain.filter(exchange);
	}


}
