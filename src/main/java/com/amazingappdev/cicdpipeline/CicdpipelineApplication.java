package com.amazingappdev.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdpipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdpipelineApplication.class, args);
	}

	@GetMapping("/hello")
	public String getMsg()
	{
		return "welcome";
	}
}
