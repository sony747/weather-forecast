package com.sony.weatherapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class WeatherServiceExceptionHandler {

	@ExceptionHandler(value = {Exception.class})
	//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> handleAllExceptions(Exception ex, WebRequest request){
		System.out.println("Yahoo:: "+request.getContextPath()+ " :request: "+request);
		return new ResponseEntity<String>("Exception Occured: "+ex.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);		
	}
}
