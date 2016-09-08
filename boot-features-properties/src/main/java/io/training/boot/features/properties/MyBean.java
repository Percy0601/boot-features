package io.training.boot.features.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import lombok.Data;
import lombok.ToString;

@Repository
@Data
@ToString
public class MyBean {
	
	@Value("${name}")
	private String name;
	@Value("${app.encoding}")
	private String appEncoding;
	@Value("${app.java.version}")
	private String appJavaVersion;
	@Value("${app.name}")
	private String appName;
	@Value("${app.description}")
	private String appDescription;
	
}
