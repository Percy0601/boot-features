package io.training.boot.features.validation.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ValidationServiceController {
    @Autowired
    private ValidationService validationService;

    @GetMapping("/valid-service-create")
    public String validCreateService() {
        User user = new User();

        user.setAge(10);
        user.setName("percy");

        validationService.create(user);
        return "验证服务的创建方式！";
    }

    @GetMapping("/valid-service-basic")
    public String validBasicService() {

        validationService.basic("=============");
        return "验证服务的创建方式！";
    }


}
