package com.example.dockerjenkinstutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DockerJenkinsTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsTutorialApplication.class, args);
	}

	@GetMapping("/")
	public String message() {
		return "Welcome to the website!";
	}

}
