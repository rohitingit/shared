package com.shared.common.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest implements Serializable{

	private static final long serialVersionUID = -4095890266848846871L;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String userName;
	
	private String oldPassword;
	
	private String password;
	
}
