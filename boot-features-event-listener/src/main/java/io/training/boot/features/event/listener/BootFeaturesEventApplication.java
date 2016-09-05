package io.training.boot.features.event.listener;

import org.springframework.boot.SpringApplication;

import io.training.boot.features.event.listener.event.MyApplicationStartedEvent;
import lombok.extern.slf4j.Slf4j;

/**
 * 参加Spring Reference<br>
 * http://blog.csdn.net/liaokailin/article/details/48186331
 * 
 * 
 * @author percy
 *
 */
@Slf4j
public class BootFeaturesEventApplication {

	public static void main(String[] args) throws Exception {
		log.info("Show Feature Event-Listener");
		
		// TODO 配置EventListenter时候有两种方式，一种是手动的，另外一种是在META-INF/spring.factores配置
		SpringApplication app = new SpringApplication(BootFeaturesEventApplication.class);
		app.addListeners(new MyApplicationStartedEvent());
		app.run(args);
	}

}
