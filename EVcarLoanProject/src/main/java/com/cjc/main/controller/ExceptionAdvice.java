package com.cjc.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cjc.main.exception.ApplicantServiceException;
import com.cjc.main.model.ApplicantError;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(ApplicantServiceException.class)
	public ResponseEntity<ApplicantError> mapStudentError(ApplicantServiceException ae){
		
		System.out.println("3 in exceptionadvice");
		ApplicantError serror=new ApplicantError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ae.getMessage());
		
		return new ResponseEntity<ApplicantError>(serror ,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
