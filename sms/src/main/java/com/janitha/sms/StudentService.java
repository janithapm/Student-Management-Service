package com.janitha.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//@EnableResourceServer
public class StudentService {

	public static void main(String[] args) {
		SpringApplication.run(StudentService.class, args);
	}

}
