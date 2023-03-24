package com.signal.trading.exceptionhandle;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.signal.trading.model.ErrorDTO;

import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(value = {ConstraintViolationException.class})
	public 	ResponseEntity<ErrorDTO> handleConstraintVoilation(ConstraintViolationException ex){
		LOGGER.info("handle constraint voilation");
		ErrorDTO customError = new ErrorDTO();
		customError.setDateTime(new Date());
		customError.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorDTO>(customError,null, HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
	public 	ResponseEntity<ErrorDTO> handleConstraintVoilation(MethodArgumentTypeMismatchException ex){
		LOGGER.info("handle method argument exception");
		ErrorDTO customError = new ErrorDTO();
		customError.setDateTime(new Date());
		customError.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorDTO>(customError,null, HttpStatus.BAD_REQUEST) ;
	}

}
