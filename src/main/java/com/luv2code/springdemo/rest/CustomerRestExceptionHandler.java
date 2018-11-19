package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	//Add an exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleNotFound(CustomerNotFoundException exception){
	
		CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
		customerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		customerErrorResponse.setMessage(exception.getMessage());
		customerErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<CustomerErrorResponse>(customerErrorResponse,HttpStatus.NOT_FOUND);
	}
	
	
	//Add an exception handler for all
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleAllOther(Exception exception){
	
		CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
		customerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		customerErrorResponse.setMessage(exception.getMessage());
		customerErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<CustomerErrorResponse>(customerErrorResponse,HttpStatus.BAD_REQUEST);
	}
}
