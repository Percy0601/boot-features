package io.training.boot.features.gorm.groovy

import grails.gorm.annotation.Entity

/**
 * Created by percy on 17-5-9.
 */
@Entity
class Person {
    String firstName
    String lastName

    static mapping = {
        table 'people'
        version false
        id column: 'id'
    }
}
