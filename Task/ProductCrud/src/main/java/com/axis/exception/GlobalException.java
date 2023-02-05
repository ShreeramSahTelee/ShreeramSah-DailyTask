
package com.axis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity<ErrorInfo> myIdException(IdNotFoundException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
	}
	
	



}
//package com.axis.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class GlobalException {
//@ExceptionHandler(IdNotFoundException.class)
//ResponseEntity<String> myexception(IdNotFoundException exception){
//	return new ResponseEntity<String>(exception.getMsg(),HttpStatus.NOT_FOUND);
//	
//}
//@ExceptionHandler(InvalidAgeException.class)
//ResponseEntity<String> myexception2(InvalidAgeException exception){
//	return new ResponseEntity<String>(exception.getMsg(),HttpStatus.BAD_REQUEST);
//}
//
//
//
//}
