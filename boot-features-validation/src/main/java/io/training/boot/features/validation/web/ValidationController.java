package io.training.boot.features.validation.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.training.boot.features.validation.exception.ValidationException;
import io.training.boot.features.validation.response.ValidationResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ValidationController {

	@GetMapping("/valid-bean")
	public String valid(@Valid ValidBean bean, BindingResult result) {

		if (result.hasErrors()) {
			List<ObjectError> list = result.getAllErrors();
			for (ObjectError error : list) {
				log.info("{}---{}---{}", error.getCode(), error.getArguments(), error.getDefaultMessage());
			}
		}
		return "Hello:" + bean.getName();
	}

	@GetMapping("/custom-properties")
	public String custom(@Valid SampleProperties bean) {
		return "验证自定义的Validator";
	}

	@GetMapping("/fail")
	public String fail() {
		throw new ValidationException("Oh dear!");
	}

	@GetMapping("/fail2")
	public String fail2() {
		throw new IllegalStateException();
	}

	@ExceptionHandler(ValidationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ValidationResponse handleMyRuntimeException(ValidationException exception) {
		return new ValidationResponse("============" + exception.getMessage());
	}
}
