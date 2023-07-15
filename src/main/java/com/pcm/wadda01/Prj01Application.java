package com.pcm.wadda01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableScheduling
public class Prj01Application {

	public static void main(String[] args) {
		SpringApplication.run(Prj01Application.class, args);
	}

	@GetMapping
	public String HelloWorld() {
		return "Hello World";
	}
}
