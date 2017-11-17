package com.shared.common.exception;

import org.springframework.http.HttpStatus;

/**
 * @author Rohit
 *
 */
public class RequestException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private HttpStatus httpStatus;
	
	public RequestException(String message, HttpStatus httpStatus) {
		this(message);
		this.httpStatus = httpStatus;
	}

	public RequestException(String message) {
		super(message);
	}
	
	public RequestException(Exception exception) {
		super(exception);
	}
	
	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}
