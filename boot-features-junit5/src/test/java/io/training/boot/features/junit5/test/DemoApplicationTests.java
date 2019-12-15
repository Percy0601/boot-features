package io.training.boot.features.junit5.test;

import io.training.boot.features.junit5.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    SomeService someService;
    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        someService.some();
    }

}
