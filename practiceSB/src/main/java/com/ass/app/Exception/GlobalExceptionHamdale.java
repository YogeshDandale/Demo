package com.ass.app.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHamdale {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> ProductNotFoundEx(Exception e, WebRequest request) {
		
	 ExceptionResourse resourse = new  ExceptionResourse(new Date(),e.getMessage(),request.getDescription(false));
	 
	 return new ResponseEntity(resourse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> ProductNotFoundEx(ProductNotFoundException e, WebRequest request) {
		
	 ExceptionResourse resourse = new  ExceptionResourse(new Date(),e.getMessage(),request.getDescription(false));
	 
	 return new ResponseEntity(resourse,HttpStatus.NOT_FOUND);
	}
}
