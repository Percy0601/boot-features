package io.training.boot.features.condition;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("custom.properties")
@ConfigurationProperties(prefix = "custom")
public class CustomConfigProperties {

}
