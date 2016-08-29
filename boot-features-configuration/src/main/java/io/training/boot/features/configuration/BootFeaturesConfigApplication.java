package io.training.boot.features.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

@ImportAutoConfiguration(ExternalAutoConfiguration.class)
public class BootFeaturesConfigApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BootFeaturesConfigApplication.class, args);
	}

}
