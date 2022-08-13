package com.mfpe.model;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ApiModel(value = "Authentication Response")
public class AuthenticationResponse {
	
	@ApiModelProperty(notes = "Name of the Project Manager")
	private String name;
	
	@ApiModelProperty(notes = "Project name of the Project Manager")
	private String projectName;
	
	@ApiModelProperty(notes = "Authentication request is valid or not")
	private boolean isValid;
}
