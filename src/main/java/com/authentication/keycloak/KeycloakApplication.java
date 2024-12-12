package com.authentication.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class KeycloakApplication {

	public static void main(String[] args) {
		//SpringApplication.run(KeycloakApplication.class, args);

		List<String> devArgs = new ArrayList<>();

		System.out.println("Property 'remo.remo.test' value: " + System.getProperty("spring.application.name"));

		devArgs.add("start-dev");

		devArgs.addAll(Arrays.asList(args));

		//Quarkus.run(devArgs.toArray(new String[devArgs.size()]));

		System.out.println("test");
	}

}
