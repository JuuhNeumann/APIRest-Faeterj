package br.edu.faeterj.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestFaeterjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestFaeterjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
