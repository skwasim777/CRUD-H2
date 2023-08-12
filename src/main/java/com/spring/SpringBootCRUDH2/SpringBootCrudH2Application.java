package com.spring.SpringBootCRUDH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class SpringBootCrudH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudH2Application.class, args);
	}

}
