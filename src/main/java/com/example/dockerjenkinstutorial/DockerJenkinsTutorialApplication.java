package com.example.dockerjenkinstutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
