package io.training.boot.features.validation.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Slf4j
@Service
@Validated
public class ValidationService {

    @Validated(CreateGroup.class)
    public void create(@Valid User user) {
        log.info("验证服务业务的作用");
    }

    public void basic(@NotNull(message = "名称不能为空") String name) {

    }

}
