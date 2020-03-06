package com.tennis.tournament.common;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class ApiError implements Serializable {

	private static final long serialVersionUID = -1654420532917218367L;

	private String code;

	private String description;

	private String message;

	
}
