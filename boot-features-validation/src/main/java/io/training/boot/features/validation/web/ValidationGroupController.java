package io.training.boot.features.validation.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Slf4j
@Validated
@RestController
public class ValidationGroupController {

    @GetMapping("/basic")
    public String validBasic(@NotNull(message = "验证基本属性不能为空") String name) {
        log.info("验证基本属性不能为空, name:{}", name);
        return "Hello: " + name;
    }

}
