package io.training.boot.features.error.resolver;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomErrorType {
	
	private int status;
	private String message;

}
