package com.shared.common.response;

import java.io.Serializable;
import java.util.List;

public class UserResponse extends BaseResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String userName;
	
	private String email;
	
}
