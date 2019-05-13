package com.itvilla.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyApiAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiAccountsApplication.class, args);
	}

}
