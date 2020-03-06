package com.tennis.tournament.exceptions;

import lombok.Getter;

@Getter
public class InvalidParameterException  extends RuntimeException{

	private static final long serialVersionUID = 1243480528448168898L;

	private final String message;
	private final String errorCode;
	
	
	public InvalidParameterException(String message, String errorCode) {
		super(message);
		this.message = message;
		this.errorCode = errorCode;
	}
	
}
