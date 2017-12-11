package io.training.boot.features.gorm;

import io.training.boot.features.gorm.groovy.Person;
import io.training.boot.features.gorm.groovy.PersonGroovyService;
import io.training.boot.features.gorm.mapper.PersonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PersonService {
    @Autowired
    PersonMapper personMapper;

    @Autowired
    private PersonGroovyService personGroovyService;
    public List<Person>  findAll() {
        List<Person> persons = personGroovyService.findAllPerson();

        List<Person> peoples = personMapper.findAllPersonMybatis();

        peoples.forEach(it -> {
            log.info("==========={}", it);
        });
        return persons;
    }
}
