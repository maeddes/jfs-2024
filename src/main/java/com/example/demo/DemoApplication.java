package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String noMoreErrors(){

		return "Error fixed!";
	}


	@GetMapping("/hello")
	public String sayHello(){

		return "Hola, HSE Winter 2024";
	}



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
