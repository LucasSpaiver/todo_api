package com.lucas.aplicationAerea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucas.aplicationAerea.repositories.TodoRepository;

@SpringBootApplication
public class AplicationAereaApplication  implements CommandLineRunner{

	@SuppressWarnings("unused")
	@Autowired
	private TodoRepository todoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AplicationAereaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
