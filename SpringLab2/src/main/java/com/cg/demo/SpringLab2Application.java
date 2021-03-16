package com.cg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
public class SpringLab2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLab2Application.class, args);
	}

}
