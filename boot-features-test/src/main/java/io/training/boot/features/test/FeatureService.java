package io.training.boot.features.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FeatureService {

    @Autowired
    UserRepo userRepo;

    public Integer add (Integer a, Integer b) {
        log.info("add, a: {}, b: {}", a, b);
        return a + b;
    }

    public User findOne(Integer id) {
        log.info("============== (null == userRepo): {}", (null == userRepo));
        return userRepo.get(id);
    }

}
