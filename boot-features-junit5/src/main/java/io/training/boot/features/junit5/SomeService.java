package io.training.boot.features.junit5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class SomeService {

    public void some() {
        log.info("==============some==============");
    }

    public User getUser() {
        User user = new User();

        Random random = new Random();
        Integer ri = random.nextInt(20);
        user.setAge(ri);
        user.setName("Some-" + ri);
        return user;
    }

}
