package com.signal.trading.model;

public class Success {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Success [message=" + message + "]";
	}

}
