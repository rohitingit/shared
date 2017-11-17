package com.shared.common.exception;

public class UnauthorizedException extends RequestException{

	private static final long serialVersionUID = -4759466972603263094L;

	public UnauthorizedException(String message) {
		super(message);
	}
	
	public UnauthorizedException(Exception exception) {
		super(exception);
	}

}
