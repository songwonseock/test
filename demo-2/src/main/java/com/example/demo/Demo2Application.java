package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Demo2Application {
	@RequestMapping("/ss")
	public String test() {
		return "NewFile";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
