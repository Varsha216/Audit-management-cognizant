package com.mfpe.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import lombok.Data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Component
@Data
@ApiModel(value = "Authentication Request")
public class AuthenticationRequest {
	@NotEmpty
	@ApiModelProperty(notes = "Username of the Project Manager")
	private String username;
	@NotEmpty
	@ApiModelProperty(notes = "Password of the Project Manager")
	private String password;
}
