package io.training.boot.features.junit5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootFeaturesJunit5Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootFeaturesJunit5Application.class, args);
        SomeService someService = context.getBean(SomeService.class);
        someService.some();
    }
}
