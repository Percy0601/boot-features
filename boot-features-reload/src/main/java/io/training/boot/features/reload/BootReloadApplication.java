package io.training.boot.features.reload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * 经过测试必须使用 mvn spring-boot:run可以进行热加载
 * 
 * @author percy
 *
 */
@SpringBootApplication
public class BootReloadApplication {

	public static void main(String[] args) throws Exception {
		// 经过测试必须使用 mvn spring-boot:run可以进行热加载
		// 经过测试必须使用 mvn spring-boot:run可以进行热加载
		// 经过测试必须使用 mvn spring-boot:run可以进行热加载
		SpringApplication.run(BootReloadApplication.class, args);
	}

}
