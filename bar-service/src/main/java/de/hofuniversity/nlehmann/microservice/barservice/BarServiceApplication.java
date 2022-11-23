package de.hofuniversity.nlehmann.microservice.barservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarServiceApplication.class, args);
	}

}
