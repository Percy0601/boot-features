package io.training.boot.features.test.junit;

import io.training.boot.features.test.SomeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class SomeServiceTest {
    @Autowired
    SomeService someService;

    @Test
    public void test() {
        assert(null !=someService) ;
        log.info("==============={}",  (null !=someService));
    }



}
