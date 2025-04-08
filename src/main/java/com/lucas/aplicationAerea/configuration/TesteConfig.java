package com.lucas.aplicationAerea.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucas.aplicationAerea.services.DBService;

@Configuration
@Profile("test")
public class TesteConfig {
	
	@Autowired
	private DBService dbService;

    @Bean
    boolean instancia() {
		this.dbService.instanciaBD();
		return true;
	}
	
}
