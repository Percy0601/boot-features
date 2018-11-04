package io.training.boot.features.test;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo {

    User get(Integer id);

}
