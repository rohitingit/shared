package com.shared.common.exception;

/**
 * @author rohit
 *
 */
public class BadRequestException extends RequestException {

	private static final long serialVersionUID = 1L;

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(Exception exception) {
		super(exception);
	}

}
