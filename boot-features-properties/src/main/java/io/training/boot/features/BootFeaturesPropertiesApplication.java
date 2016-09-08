package io.training.boot.features;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.training.boot.features.properties.JmsProperties;
import io.training.boot.features.properties.MyBean;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BootFeaturesPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootFeaturesPropertiesApplication.class, args);
		MyBean bean = applicationContext.getBean(MyBean.class);
		log.info("=========={}", bean.toString());

		JmsProperties custom = applicationContext.getBean(JmsProperties.class);
		log.info("=========={}", custom.toString());
	}

}
