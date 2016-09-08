package io.training.boot.features.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import io.training.boot.features.properties.JmsProperties;

@Configuration
@EnableConfigurationProperties(JmsProperties.class)
public class CustomConfig {

}
