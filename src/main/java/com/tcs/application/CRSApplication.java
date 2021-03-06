package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({ "com.tcs.*" })
@EnableAutoConfiguration
@EnableWebMvc
public class CRSApplication {

	public static void main(String[] args) {
		SpringApplication.run(CRSApplication.class, args);
	}

}
