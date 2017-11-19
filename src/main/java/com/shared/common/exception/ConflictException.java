package com.shared.common.exception;

/**
 * @author Rohit
 *
 */
public class ConflictException extends RequestException {

	private static final long serialVersionUID = 1L;

	public ConflictException(String message) {
		super(message);
	}

	public ConflictException(Exception exception) {
		super(exception);
	}

}
