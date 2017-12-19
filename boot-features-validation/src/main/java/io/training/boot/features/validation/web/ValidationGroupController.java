package io.training.boot.features.validation.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Slf4j
@Validated
@RestController
public class ValidationGroupController {

    @Autowired
    private ValidationService validationService;

    @GetMapping("/basic")
    public String validBasic(@NotNull(message = "验证基本属性不能为空") String name) {
        log.info("验证基本属性不能为空, name:{}", name);
        return "Hello: " + name;
    }

    @GetMapping("/basic-binding-result")
    public String validBindingResult(@NotNull(message = "验证基本属性不能为空") String name, BindingResult result) {
        log.info("验证基本属性不能为空, name:{}", name);
        return "Hello: " + name;
    }

    @GetMapping("/basic-model-attribute")
    public String validModelAttribute(User user, BindingResult result) {
        log.info("验证基本属性不能为空, user:{}", user);

        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                log.info("====={}---{}---{}", error.getCode(), error.getArguments(), error.getDefaultMessage());
            }
            return "验证出错";
        }

        return "Hello: " + user;
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
    public String validCreate(@Validated(value = CreateGroup.class) User user, BindingResult result) {
        log.info("验证自定义类：创建类");

        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                log.info("{}---{}---{}", error.getCode(), error.getArguments(), error.getDefaultMessage());
            }
            return "验证出错";
        }
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
    public String validUpdate(@Validated(value = UpdateGroup.class) User user, BindingResult result) {
        log.info("验证自定义类：更新类");
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                log.info("====={}---{}---{}", error.getCode(), error.getArguments(), error.getDefaultMessage());
            }
            return "验证出错";
        }
        return "验证自定义类：更新类";
    }

}
