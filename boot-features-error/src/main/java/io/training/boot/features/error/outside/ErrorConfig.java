package io.training.boot.features.error.outside;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfig {

	@Bean
	public ErrorPageRegistrar errorPageRegistrar(){
	    return new MyErrorPageRegistrar();
	}

	private static class MyErrorPageRegistrar implements ErrorPageRegistrar {

	    @Override
	    public void registerErrorPages(ErrorPageRegistry registry) {
	        registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400"));
	    }

	}
	
}
