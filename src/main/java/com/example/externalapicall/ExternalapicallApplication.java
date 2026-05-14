package com.example.externalapicall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExternalapicallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalapicallApplication.class, args);
	}

}
