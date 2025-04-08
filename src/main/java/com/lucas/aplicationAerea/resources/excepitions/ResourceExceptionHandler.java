package com.lucas.aplicationAerea.resources.excepitions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lucas.aplicationAerea.services.exceptions.ObjectNotFoundExceptions;

import jakarta.servlet.ServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundExceptions.class)
	public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundExceptions e, ServletRequest request) {
		StandartError error = new StandartError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
