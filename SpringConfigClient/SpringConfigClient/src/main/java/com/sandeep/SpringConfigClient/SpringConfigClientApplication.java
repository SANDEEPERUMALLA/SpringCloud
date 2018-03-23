package com.sandeep.SpringConfigClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(org.springframework.core.env.Environment environment){

		return args -> {

			System.out.println(environment.getProperty("spring.cloud.config.uri"));

			System.out.println(environment.getProperty("server.port"));
		};
	}
}
