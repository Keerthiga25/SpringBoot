package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner{
	public static final Logger logger = LoggerFactory.getLogger(SpringBootAppApplication.class);

	public static void main(String[] args) {
		logger.info("It's a simple spring boot application");
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
	@Override
	public void run(String... agrs) throws Exception {
		logger.info("Hi");
	}

}
