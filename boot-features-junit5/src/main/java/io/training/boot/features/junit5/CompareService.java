package io.training.boot.features.junit5;

import org.springframework.stereotype.Service;

@Service
public class CompareService {

    public boolean compare(User user) {

        if(user.getAge() > 10) {
            return true;
        }
        return false;
    }

}
