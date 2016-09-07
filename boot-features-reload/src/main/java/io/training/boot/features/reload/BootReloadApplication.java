package io.training.boot.features.reload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * <ul>
 * <li> mvn spring-boot:run 
 * <li>-javaagent:/home/percy/Downloads/springloaded-1.2.6.RELEASE.jar -noverify
 * </ul>
 * @author percy
 *
 */
@SpringBootApplication
public class BootReloadApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootReloadApplication.class, args);
	}

}
