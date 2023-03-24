package com.signal.trading.model;

import java.util.Date;

public class ErrorDTO {

	private Date dateTime;
	private String message;
	
	
	public Date getDateTime() {
		return dateTime;
	}


	public void setDateTime(Date date) {
		this.dateTime = date;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Error [dateTime=" + dateTime + ", message=" + message + "]";
	}
	
	
}
