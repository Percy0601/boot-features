package io.training.boot.features.junit5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SomeService {

    public void some() {
        log.info("==============some==============");
    }


}
