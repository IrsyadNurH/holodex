package com.holodex.holodex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories("com.holodex.repository")
@ComponentScan(basePackages = {
		"com.holodex.controller" ,
		"com.holodex.service",
		"com.holodex.model" ,
		"com.holodex.repository"
})
public class HolodexApplication {
	public static void main(String[] args) {
		SpringApplication.run(HolodexApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
