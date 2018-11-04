package io.training.boot.features.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SomeService {

    public String handle(String name) {
        log.info("处理Spring Boot Bean的方法。。。");
        return "Hello, " + name;
    }

}
