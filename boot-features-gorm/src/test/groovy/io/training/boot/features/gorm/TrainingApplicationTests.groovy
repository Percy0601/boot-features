package io.training.boot.features.gorm

import groovy.util.logging.Slf4j
import io.training.boot.features.gorm.groovy.Person
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

@RunWith(SpringRunner)
@SpringBootTest
@Slf4j
class TrainingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@Transactional
	void testAdd() {
		int i = new Random().nextInt(100);
		log.info("==================");
		Person person = new Person(firstName:"Percy" + i, lastName: "Zhao")
//		Person.saveAll(person)
		person.save()
		log.info("Person:{}", Person.list())
		List<?> ps = Person.findAllByFirstNameLike("%Percy")

		ps = Person.findAllByLastName("Zhao")
		log.info("findAllByFirstNameLike:{}", ps)
	}

	@Test
	@Transactional(readOnly = true)
	void testList() {
		log.info("Person:{}", Person.list())
	}

}
