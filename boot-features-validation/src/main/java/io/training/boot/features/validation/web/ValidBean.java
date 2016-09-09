package io.training.boot.features.validation.web;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class ValidBean {

	@NotEmpty(message = "{valid.name.empty}")
	@Length(min = 2, max = 5, message = "{valid.name.length}")
	private String name;

}
