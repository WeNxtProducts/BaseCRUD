package com.example.democrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication

@PropertySource({ "classpath:ApplicationMessage.properties"})
public class BaseCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseCustomerApplication.class, args);
	}

}
