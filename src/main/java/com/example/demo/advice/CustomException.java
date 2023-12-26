package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.internDto;
import com.example.demo.exception.StudentNotFoundException;

@RestControllerAdvice
public class CustomException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public internDto internNotFound(StudentNotFoundException ev)
	{
		
		return new internDto(ev.getMessage(),"Error...",404);
	}

}
