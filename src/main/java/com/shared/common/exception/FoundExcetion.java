package com.shared.common.exception;

/**
 * @author Rohit
 *
 */
public class FoundExcetion extends RequestException {

	private static final long serialVersionUID = 1L;

	public FoundExcetion(String message) {
		super(message);
	}

	public FoundExcetion(Exception exception) {
		super(exception);
	}

}
