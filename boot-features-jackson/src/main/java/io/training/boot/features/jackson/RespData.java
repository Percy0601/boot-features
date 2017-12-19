package io.training.boot.features.jackson;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class RespData<T> {
    private String code;
    @JsonView(View.Basic.class)
    private T result;
}
