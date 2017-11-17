package com.shared.common.exception;

/**
 * @author Rohit
 *
 */
public class NotFoundException extends RequestException{
	
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(message);
	}
	
	public NotFoundException(Exception exception) {
		super(exception);
	}

}
