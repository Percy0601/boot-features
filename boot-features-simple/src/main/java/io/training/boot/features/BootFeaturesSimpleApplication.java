package io.training.boot.features;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @SpringBootApplication
 * 
 * @author percy
 *
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BootFeaturesSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootFeaturesSimpleApplication.class, args);
	}

}
