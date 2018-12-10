package io.training.boot.features.starter.custom.service;

import io.training.boot.features.starter.custom.config.CustomProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class CustomService {

    private CustomProperties customProperties;

    public void custom(){
        log.info("每个starter都有一个核心的业务服务:{}", this);
    }
}
