package io.training.boot.features.servlet.initialization;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Slf4j
public class CustomServletContextInitializer extends SpringBootServletInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		log.info("使用servlet.ServletContextInitializer{}", servletContext);
	}

}
