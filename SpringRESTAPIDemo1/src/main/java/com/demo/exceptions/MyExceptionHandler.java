package com.demo.exceptions;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler  extends ResponseEntityExceptionHandler{

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorObject> handleEmpExpcetion(EmployeeNotFoundException ex) {
		
		ErrorObject error = new ErrorObject();
		error.setMessage(ex.getMessage());
		error.setPath("/api/employees/{empId}");
		error.setTimeStamp(LocalDateTime.now());
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ErrorObject>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ErrorObject> handleMethodArgumentMismatchException(MethodArgumentTypeMismatchException ex){
		ErrorObject error = new ErrorObject();
		error.setMessage(ex.getMessage());
		error.setPath("/api/employees/{empId}");
		error.setTimeStamp(LocalDateTime.now());
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		
		return new ResponseEntity<ErrorObject>(error, HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<InvalidRequestBodyError> handleInvalidRequestBodyException(MethodArgumentNotValidException ex){
//		
//		InvalidRequestBodyError invalidReqBodyError = new InvalidRequestBodyError();
//
//		List<FieldError> errors =  ex.getFieldErrors();
//		
//		List<CustomFieldError> fieldErrors = errors.stream()
//												.map(error -> new CustomFieldError(
//														error.getField(),
//														error.getDefaultMessage()
//														))
//												.collect(Collectors.toList());
//		
//		invalidReqBodyError.setFieldErrors(fieldErrors);
//		invalidReqBodyError.setTimeStamp(LocalDateTime.now());
//		invalidReqBodyError.setPath("/employee");
//		invalidReqBodyError.setMessage(ex.getMessage());
//		invalidReqBodyError.setStatusCode(HttpStatus.BAD_REQUEST.value());
//		
//		
//		return new ResponseEntity<InvalidRequestBodyError>(invalidReqBodyError, HttpStatus.BAD_REQUEST);
//	}
	
}
