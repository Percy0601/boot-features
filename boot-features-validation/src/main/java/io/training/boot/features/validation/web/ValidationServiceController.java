package io.training.boot.features.validation.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import java.util.List;

@Slf4j
@RestController
public class ValidationServiceController {
    @Autowired
    private ValidationService validationService;

    @GetMapping("/valid-service-create")
    public String validCreateService() {
        User user = new User();

//        user.setAge(10);
//        user.setName("percy");

        try {
            validationService.create(user);
        } catch (ConstraintViolationException cve) {
            cve.getConstraintViolations().forEach(it -> {
                String message = it.getMessage();
                log.error("当前错误信息为：{}", message);
            });
            log.error("调用服务验证异常：{}, 栈信息：", cve.getMessage(), cve);
        } catch (Exception e) {
            log.error("调用服务异常：{}, 栈信息：", e.getMessage(), e);
        }

        return "验证服务的创建方式！";
    }

    @GetMapping("/valid-service-basic")
    public String validBasicService() {
        validationService.basic(null);
        return "验证服务的创建方式！";
    }


}
