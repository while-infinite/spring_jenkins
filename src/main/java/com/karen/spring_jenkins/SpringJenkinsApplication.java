package com.karen.spring_jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringJenkinsApplication {

	public static void main(String[] args) {
		log.info("Application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	@PostConstruct
	public void init(){
		log.info("Application started");
	}


}
