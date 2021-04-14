package com.poovseka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHerokuApplication {

	@GetMapping("/")
	public String display() {
		return "Spring Boot app deployed in Heroku";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuApplication.class, args);
	}

}
