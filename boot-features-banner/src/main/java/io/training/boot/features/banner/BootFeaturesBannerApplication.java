package io.training.boot.features.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootFeaturesBannerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BootFeaturesBannerApplication.class);
		// 开启或者关闭Banner
		// 当然这里也可以手动设置
		// application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
