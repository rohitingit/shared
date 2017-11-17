package com.shared.common.exception;

/**
 * @author Rohit
 *
 */
public class OperationFailureException extends RequestException{
	
	private static final long serialVersionUID = 1L;

	public OperationFailureException(String message) {
		super(message);
	}
	
	public OperationFailureException(Exception exception) {
		super(exception);
	}
	
}
