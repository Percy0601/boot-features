package io.training.boot.features.error;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class BootErrorResolverApplicationTest {
	
	public void test() {
		log.info("标准测试方法");
		
	}

}
