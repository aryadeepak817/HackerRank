package com.hackerrank.restcontrolleradvice.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler 
{
 //TODO:: implement handler methods for FizzException, BuzzException and FizzBuzzException
 @ExceptionHandler(FizzException.class)
 public ResponseEntity<Object> handleExceptions(FizzException exception, WebRequest webRequest)
 {
    ExceptionResponse response = new ExceptionResponse();
    response.setDateTime(LocalDateTime.now());
    response.setMessage("Not found");
    
    ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
 }
 
 @ExceptionHandler(BuzzException.class)
 public ResponseEntity<Object> handleExceptions(BuzzException exception, WebRequest webRequest)
 {
    ExceptionResponse response = new ExceptionResponse();
    response.setDateTime(LocalDateTime.now());
    response.setMessage("Not found");
    
    ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
 }
 
 @ExceptionHandler(FizzBuzzException.class)
 public ResponseEntity<Object> handleExceptions(FizzBuzzException exception, WebRequest webRequest)
 {
    ExceptionResponse response = new ExceptionResponse();
    response.setDateTime(LocalDateTime.now());
    response.setMessage("Not found");
    
    ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
 }
 
}
