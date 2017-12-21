package io.training.boot.features.jackson;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.validation.constraints.Null;

@Data
public class RespData<T> {
    private String code;
    @JsonView(Object.class)
    private T result;
}
