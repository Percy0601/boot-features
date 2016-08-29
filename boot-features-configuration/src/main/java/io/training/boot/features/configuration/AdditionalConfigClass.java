package io.training.boot.features.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdditionalConfigClass {

	@Bean
	public MyService myService() {
		return new MyService();
	}

}
