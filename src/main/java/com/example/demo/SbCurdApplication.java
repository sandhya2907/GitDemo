package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCurdApplication.class, args);
		System.out.println("Hello Modified ");
		System.out.println("Hello 1");
	}

}
