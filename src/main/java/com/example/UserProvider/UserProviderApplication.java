package com.example.UserProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//
//@ComponentScan(basePackages = {"com.example.UserProvider.Dao","com.example.UserProvider.Controller","com.example.UserProvider","com.example.UserProvider.Model"})
//@EntityScan("com.example.UserProvider.Model")
//@EnableAutoConfiguration
@SpringBootApplication
public class UserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProviderApplication.class, args);
	}
}
