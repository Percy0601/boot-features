package io.training.boot.features.event.listener.event;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。<br>
 * 上下文创建完成后执行的事件监听器<br>
 * 
 * 
 * @author percy
 *
 */
@Slf4j
public class MyApplicationPreparedEvent implements ApplicationListener<ApplicationPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		ConfigurableApplicationContext cac = event.getApplicationContext();
		log.info("应用状态{}", cac.isActive());
	}

}
