package com.janitha.sms.model;

import org.springframework.stereotype.Component;

@Component
public class ExceptionReponse {
	
	String errorMessage;
	String errorCode;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
