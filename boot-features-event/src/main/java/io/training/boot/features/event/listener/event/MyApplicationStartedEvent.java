package io.training.boot.features.event.listener.event;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import lombok.extern.slf4j.Slf4j;

/**
 * spring boot启动开始时执行的事件<br>
 * NO1
 * 
 * @author percy
 *
 */
@Slf4j
public class MyApplicationStartedEvent implements ApplicationListener<ApplicationStartedEvent> {
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		log.info("Close Banner...");
		System.out.println("=====================");
		SpringApplication app = event.getSpringApplication();
		app.setBannerMode(Banner.Mode.OFF);// 不显示banner信息
	}
}
