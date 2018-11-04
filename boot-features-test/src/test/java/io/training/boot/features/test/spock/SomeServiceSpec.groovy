package io.training.boot.features.test.spock

import io.training.boot.features.test.BootTestApplication
import io.training.boot.features.test.SomeService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = BootTestApplication)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("test")
class SomeServiceSpec extends Specification{
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SomeService someService

    def "test autowired"() {
        when:
        String result = someService.handle("123")
        log.info("==============={}", result)
        then:
        someService != null
    }

}
