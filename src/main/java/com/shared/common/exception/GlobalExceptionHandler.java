package com.shared.common.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.shared.common.response.BaseErrorResponse;

/**
 * @author rohit
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=BadRequestException.class)
	@ResponseBody
	public BaseErrorResponse handleBadRequestException(HttpServletRequest request , BadRequestException ex) {
		logger.error("## Bad Request Exception Error Occured : "+ex.getMessage());
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(ex.getMessage());
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		return response;
	}
	
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(value=OperationFailureException.class)
	@ResponseBody
	public BaseErrorResponse handleOperationFailureException(HttpServletRequest request , OperationFailureException ex) {
		logger.error("## Operation Failure Exception Error Occured : "+ex.getMessage());
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(ex.getMessage());
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		return response;
	}

	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(value=ConflictException.class)
	@ResponseBody
	public BaseErrorResponse handleFoundException(HttpServletRequest request , ConflictException ex) {
		logger.error("## Found Excetion Error Occured : " + ex.getMessage());
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(ex.getMessage());
		response.setStatus(HttpServletResponse.SC_OK);
		return response;
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ExceptionHandler(value=NotFoundException.class)
	@ResponseBody
	public BaseErrorResponse handleNotFoundException(HttpServletRequest request , NotFoundException ex) {
		logger.error("## Not Found Exception Error Occured :" + ex.getMessage());
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(ex.getMessage());
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(value=RequestException.class)
	@ResponseBody
	public BaseErrorResponse handleRequestException(HttpServletRequest request , RequestException requestException) {
		logger.error("Exception Error Occured : " + requestException.getMessage());
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(requestException.getMessage());
		response.setStatus(requestException.getHttpStatus().value());
		return response;
	}
	
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(value=UnauthorizedException.class)
	@ResponseBody
	public BaseErrorResponse handleUnauthorizedException(HttpServletRequest request , Exception ex) {
		logger.error("Unauthorized Exception Error Occured : " + ex.getMessage());
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(ex.getMessage());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		return response;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public BaseErrorResponse handleException(HttpServletRequest request , Exception ex) { 
		logger.error("Exception Error Occured : ",ex);
		BaseErrorResponse response=new BaseErrorResponse();
		response.setResponseMessage(ex.toString());
		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		return response;
	}
}
