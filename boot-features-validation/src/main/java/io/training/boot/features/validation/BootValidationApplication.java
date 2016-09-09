package io.training.boot.features.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;

import io.training.boot.features.validation.validator.SamplePropertiesValidator;

@SpringBootApplication
public class BootValidationApplication {

	@Bean
	public Validator configurationPropertiesValidator() {
		return new SamplePropertiesValidator();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootValidationApplication.class, args);
	}

}
