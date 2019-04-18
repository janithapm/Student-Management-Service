package com.janitha.sms.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.janitha.sms.model.ExceptionReponse;

public class GlobalExceptionHandler {
	
	@Autowired
	ExceptionReponse exceptionResponse ;
	
	@ExceptionHandler(SMSException.class)
	public ResponseEntity<ExceptionReponse> serviceExceptionHandler(SMSException smsException){
		exceptionResponse.setErrorMessage(smsException.getMessage());
		exceptionResponse.setErrorCode(smsException.getErrorCode());
		return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

}
