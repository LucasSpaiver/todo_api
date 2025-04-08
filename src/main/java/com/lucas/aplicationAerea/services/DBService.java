package com.lucas.aplicationAerea.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.aplicationAerea.domain.Todo;
import com.lucas.aplicationAerea.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBD() {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		todoRepository.saveAll(Arrays.asList());
	}

}
