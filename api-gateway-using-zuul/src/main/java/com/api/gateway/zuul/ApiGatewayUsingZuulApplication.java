package com.api.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayUsingZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayUsingZuulApplication.class, args);
	}

}
