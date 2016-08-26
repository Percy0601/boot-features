package io.training.boot.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.training.boot.features.properties.MyBean;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootFeaturesApplicationTests {

	@Autowired
	private MyBean myBean;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void test() {

	}

}
