package com.springsetup.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SpringBasicsApplication {

	public static Logger logger =  LoggerFactory.getLogger(SpringBasicsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(SpringBasicsApplication.class, args);
	}
}
