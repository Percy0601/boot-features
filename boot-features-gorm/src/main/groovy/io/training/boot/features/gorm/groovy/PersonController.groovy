package io.training.boot.features.gorm.groovy

import io.training.boot.features.gorm.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by percy on 17-5-9.
 */
@RestController
class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/people")
    @Transactional(readOnly = true)
    List<Person> people() {
        return personService.findAll();
    }

    @RequestMapping("/people/add")
    @Transactional
    String add(Person person) {
        Person.saveAll(person)
        return person
    }
}
