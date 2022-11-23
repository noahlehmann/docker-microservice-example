package de.hofuniversity.nlehmann.microservice.fooservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FooServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooServiceApplication.class, args);
	}

}
