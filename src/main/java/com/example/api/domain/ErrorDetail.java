package com.example.api.domain;

public class ErrorDetail {

	private String message;
	
	public ErrorDetail(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
