package com.tennis.tournament.controllers;

 
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tennis.tournament.common.ApiError;
import com.tennis.tournament.common.ApiResponse;
import com.tennis.tournament.exceptions.InvalidParameterException;
import com.tennis.tournament.exceptions.MissingMandatoryException;

@ControllerAdvice
@RestController

public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ApiResponse<String> handleAllExceptions(Exception ex, WebRequest request) {
		if (ex instanceof InvalidParameterException) {
			InvalidParameterException exception = (InvalidParameterException) ex;
			return new ApiResponse<>(
					ApiError.builder().code(exception.getErrorCode()).description(exception.getMessage()).build());
		} else if(ex instanceof MissingMandatoryException) {
			MissingMandatoryException exception = (MissingMandatoryException) ex;
			return new ApiResponse<>(
					ApiError.builder().code(exception.getErrorCode()).description(exception.getMessage()).build());
		}
		
		return new ApiResponse<>(ApiError.builder().code("001").description("Unexpected error during the execution of the reques").build());
	}
}