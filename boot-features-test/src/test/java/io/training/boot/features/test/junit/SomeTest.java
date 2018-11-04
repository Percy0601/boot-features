package io.training.boot.features.test.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Slf4j
public class SomeTest {

    @Before
    public void init() {
        log.info("=================@Before每一个测试方法前执行");
    }

    @BeforeClass
    public static void initClass() {
        log.info("=================@BeforeClass测试类方法前执行");
    }

    @Test
    public void test() {
        log.info("=====================@Test单元测试方法");
    }

    @Test
    public void test2() {
        log.info("=====================@Test单元测试方法test2");
    }


}
