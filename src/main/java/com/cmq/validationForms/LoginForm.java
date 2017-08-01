package com.cmq.validationForms;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {

	@NotNull(message="Should not be null")
	@Email(message="Should be an email id")
	@NotEmpty(message="Should not be blank")
	private String username;
	
	@NotNull(message="Should not be null")
	@NotEmpty(message="Should not be empty")
	@NotBlank(message="Should not be blank")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
