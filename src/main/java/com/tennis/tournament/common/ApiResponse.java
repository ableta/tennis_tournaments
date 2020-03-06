package com.tennis.tournament.common;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> implements Serializable {

	private static final long serialVersionUID = 8319625608044077789L;

	private T result;

	private ApiError error;

	public ApiResponse() {
		super();
	}

	public ApiResponse(T result) {
		super();
		this.result = result;
	}

	public ApiResponse(ApiError error) {
		super();
		this.error = error;
	}
}

