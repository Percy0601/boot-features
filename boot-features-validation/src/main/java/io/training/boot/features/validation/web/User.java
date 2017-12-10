package io.training.boot.features.validation.web;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class User {

    @NotNull(message = "主键不能为空", groups = UpdateGroup.class)
    private Long id;
    @NotNull(message = "姓名不能为空", groups = CreateGroup.class)
    private String name;
    @NotNull(message = "年龄不能为空", groups = CreateGroup.class)
    private Integer age;
}
