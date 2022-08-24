package com.nseit.SpringBootPersonDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.MainMenu;

@SpringBootApplication
public class SpringBootPersonDetailsApplication implements CommandLineRunner {

	@Autowired
	private MainMenu mainMenu;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonDetailsApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	}
}
