package io.training.boot.features.banner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootFeaturesBannerApplicationTest {
	
	@Test
	public void test () {
		log.info("===========");
	}

}
