package com.developer.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@RestController*/
@SpringBootApplication
@ComponentScan(basePackages = "com.developer.controller")
public class HelloWorldApplication {
	/*
	 * @GetMapping("/") String home() { return "welcome"; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
