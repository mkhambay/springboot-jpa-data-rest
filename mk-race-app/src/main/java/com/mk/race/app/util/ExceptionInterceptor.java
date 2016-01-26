package com.mk.race.app.util;

import javax.ws.rs.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionInterceptor {

	@ExceptionHandler(RaceApplicationException.class)
	public ResponseEntity<Error> reportError(RaceApplicationException e) {
		Integer httpStatusCode = e.getStatusCode();
		Error error = new Error(httpStatusCode, e.getMessage());
		return new ResponseEntity<Error>(error, 
				httpStatusCode!=null?HttpStatus.valueOf(httpStatusCode.intValue()):HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error reportNotFoundException(NotFoundException e) {
		Error error = new Error(HttpStatus.NOT_FOUND.value(), e.getMessage());
		return error;
	}
	
}
