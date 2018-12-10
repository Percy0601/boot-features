package io.training.boot.features.starter.custom.config;

import io.training.boot.features.starter.custom.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CustomProperties.class)
@ConditionalOnClass(CustomService.class)
@ConditionalOnProperty(prefix = "custom", value = "enabled", matchIfMissing = true)
public class CustomStarterAutoConfiguration {

    @Autowired
    private CustomProperties properties;

    @Bean
    @ConditionalOnMissingBean(CustomService.class)  // 当容器中没有指定Bean的情况下，自动配置PersonService类
    public CustomService customService(){
        CustomService customService = new CustomService(properties);
        return customService;
    }

}
