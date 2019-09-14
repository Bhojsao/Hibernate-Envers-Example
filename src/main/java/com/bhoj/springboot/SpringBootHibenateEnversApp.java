package com.bhoj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Spring Boot Hibenate Enver App Main Class
 * 
 * @author Bhoj Sao
 *
 */
@SpringBootApplication(scanBasePackages = { "com.bhoj.springboot" })
@EntityScan( basePackages = {"com.bhoj.springboot.domain"} )
@EnableJpaAuditing
@EnableEurekaClient
public class SpringBootHibenateEnversApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibenateEnversApp.class, args);
	}
}
