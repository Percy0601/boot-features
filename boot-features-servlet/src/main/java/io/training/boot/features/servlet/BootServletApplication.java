package io.training.boot.features.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BootServletApplication implements ServletContextInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootServletApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		log.info("###################");
		log.info("使用已经初始化好的servletContext可以方便的添加各种Servlet, Filter, Listener...");
		// FilterRegistrationBean filterRegistrationBean = new
		// FilterRegistrationBean();
		// filterRegistrationBean.setFilter(filter);
		// servletContext.addFilter(filterName, filter);...
	}

}
