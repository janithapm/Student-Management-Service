package com.janitha.sms.exception;

public class SMSException extends RuntimeException{
	
	String errorMessage;
	String errorCode;
	
	public SMSException(String errorMessage, String errorCode) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode ;
		//super(message, cause);	
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	
	

}
