package com.shared.common.exception;

/**
 * @author Rohit
 *
 */
public class ConflictExcetion extends RequestException {

	private static final long serialVersionUID = 1L;

	public ConflictExcetion(String message) {
		super(message);
	}

	public ConflictExcetion(Exception exception) {
		super(exception);
	}

}
