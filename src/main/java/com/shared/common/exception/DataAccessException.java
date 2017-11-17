package com.shared.common.exception;

/**
 * @author Rohit
 *
 */
public class DataAccessException extends RequestException{

	private static final long serialVersionUID = 1L;

	public DataAccessException(String message) {
		super(message);
	}
	
	public DataAccessException(Exception exception) {
		super(exception);
	}
}
