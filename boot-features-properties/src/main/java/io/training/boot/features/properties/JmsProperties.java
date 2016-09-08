package io.training.boot.features.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@PropertySource("custom.properties")
@ConfigurationProperties(prefix = "jms")
public class JmsProperties {

	private String c;
	private String d;

}
