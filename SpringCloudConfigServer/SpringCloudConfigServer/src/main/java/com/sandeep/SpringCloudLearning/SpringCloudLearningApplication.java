package com.sandeep.SpringCloudLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearningApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(Environment environment){

		return args -> {

			System.out.println(environment.getProperty("spring.cloud.config.server.git.uri"));;
		};
		
	}
}
