package io.training.boot.features.jackson;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class User {

    @JsonView(View.Secret.class)
    private Long id;

    @JsonView(View.Basic.class)
    private String name;

    @JsonView(View.Secret.class)
    private String password;

    @JsonView(View.Basic.class)
    private Integer age;

    @JsonView(View.Basic.class)
    private String address;

}
