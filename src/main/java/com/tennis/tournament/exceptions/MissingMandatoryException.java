package com.tennis.tournament.exceptions;

import lombok.Getter;

@Getter
public class MissingMandatoryException extends RuntimeException {

	private static final long serialVersionUID = -2998277495704601155L;
	
	private final String message;
	private final String errorCode;

	public MissingMandatoryException(String message, String errorCode) {

		super(message);
		this.message = message;
		this.errorCode = errorCode;
	}
}
