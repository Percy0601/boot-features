package io.training.boot.features.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootFeaturesConfigApplicationTest {

	@Autowired
	MyService myService;
	@Test
	public void test() {
		log.info("myService == {}", (null == myService));
	}
}
