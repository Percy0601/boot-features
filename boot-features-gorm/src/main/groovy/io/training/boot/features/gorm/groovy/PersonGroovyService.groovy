package io.training.boot.features.gorm.groovy

import org.springframework.stereotype.Service

@Service
class PersonGroovyService {

    List<Person> findAllPerson() {
        Person.list().collect { Person p ->
            "$p.firstName $p.lastName".toString()
        }
    }
}
