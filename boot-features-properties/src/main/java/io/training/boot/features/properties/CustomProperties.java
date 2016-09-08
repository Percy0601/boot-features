package io.training.boot.features.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
@PropertySource("custom.properties")
@ConfigurationProperties(prefix = "custom")
public class CustomProperties {
	private String a;
	private String b;
}
