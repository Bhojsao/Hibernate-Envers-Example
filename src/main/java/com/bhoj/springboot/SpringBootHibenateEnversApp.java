package com.bhoj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Hibenate Enver App Main Class
 * 
 * @author Bhoj Sao
 *
 */
@SpringBootApplication(scanBasePackages = { "com.bhoj.springboot" })
public class SpringBootHibenateEnversApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibenateEnversApp.class, args);
	}
}
