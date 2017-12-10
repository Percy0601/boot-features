package io.training.boot.features.validation.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Slf4j
//@Validated
@RestController
public class ValidationGroupController {

    @GetMapping("/basic")
    public String validBasic(@NotNull(message = "验证基本属性不能为空") String name) {
        log.info("验证基本属性不能为空, name:{}", name);
        return "Hello: " + name;
    }

    /**
     * <pre>
     *     参考：http://localhost:8080/create?name=afddf&age=213
     *
     * </pre>
     * @param user
     * @return
     */
    @GetMapping("/create")
    public String validCreate(@Validated(value = CreateGroup.class) User user) {
        log.info("验证自定义类：创建类");
        return "验证自定义类：创建类";
    }

    /**
     * <pre>
     *     参考：http://localhost:8080/update?id=2323&name=akjsdf
     * </pre>
     * @param user
     * @return
     */
    @GetMapping("/update")
    public String validUpdate(@Validated(value = UpdateGroup.class) User user) {
        log.info("验证自定义类：更新类");
        return "验证自定义类：更新类";
    }

}
