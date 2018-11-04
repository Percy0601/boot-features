package io.training.boot.features.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SomeController {

    @GetMapping("/some")
    public String getSomething(String name) {
        log.info("你好，{}", name);
        return "Hello World: " + name;
    }
}
