package io.training.boot.features.validation.web;

import lombok.Data;

@Data
public class SampleProperties {
	private String host;
	private String port = "8080";
}
