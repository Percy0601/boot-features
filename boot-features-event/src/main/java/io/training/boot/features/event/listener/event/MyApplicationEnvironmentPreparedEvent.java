package io.training.boot.features.event.listener.event;

import java.util.Iterator;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import lombok.extern.slf4j.Slf4j;

/**
 * spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建<br>
 * NO2
 * 
 * 
 * @author percy
 *
 */
@Slf4j
public class MyApplicationEnvironmentPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		ConfigurableEnvironment envi = event.getEnvironment();
		MutablePropertySources mps = envi.getPropertySources();
		if (mps != null) {
			Iterator<PropertySource<?>> iter = mps.iterator();
			while (iter.hasNext()) {
				PropertySource<?> ps = iter.next();
				log.info("=====ps.getName:{};ps.getSource:{};ps.getClass:{}", ps.getName(), ps.getSource(), ps.getClass());
			}
		}
	}

}
