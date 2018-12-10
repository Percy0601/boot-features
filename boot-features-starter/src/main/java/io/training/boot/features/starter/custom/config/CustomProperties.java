package io.training.boot.features.starter.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  自定义配置
 *
 */
@Data
@ConfigurationProperties(prefix = "custom")
public class CustomProperties {
    private String a;
    private String b;
}
