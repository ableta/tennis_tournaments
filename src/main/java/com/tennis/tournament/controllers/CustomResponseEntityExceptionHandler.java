package com.tennis.tournament.controllers;

import java.security.InvalidParameterException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tennis.tournament.common.ApiResponse;

@ControllerAdvice
@RestController

public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
//	@ExceptionHandler(Exception.class)
//	public final ApiResponse<String> handleAllExceptions(Exception ex, WebRequest request) {
//		if (ex instanceof InvalidParameterException) {
//			InvalidParameterException exception = (InvalidParameterException) ex;
//			return new ApiResponse<>(
//					ApiError.builder().code(exception.getErrorCode()).description(exception.getMessage()).build());
//		} else if (ex instanceof MissingMandatoryException) {
//			MissingMandatoryException exception = (MissingMandatoryException) ex;
//			return new ApiResponse<>(
//					ApiError.builder().code(exception.getErrorCode()).description(exception.getMessage()).build());
//		}
//		return new ApiResponse<>(ApiError.builder().code(SLProperties.UNEXPECTED_ERROR_CODE)
//				.description(SLProperties.UNEXPECTED_ERROR_MESSAGE).build());
//	}
}