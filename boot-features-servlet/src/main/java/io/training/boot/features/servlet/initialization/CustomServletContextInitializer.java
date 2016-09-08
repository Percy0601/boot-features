package io.training.boot.features.servlet.initialization;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomServletContextInitializer extends SpringBootServletInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		log.info("使用servlet.ServletContextInitializer{}", servletContext);
	}

}
