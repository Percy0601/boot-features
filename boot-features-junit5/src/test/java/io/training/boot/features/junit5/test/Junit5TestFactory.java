package io.training.boot.features.junit5.test;

import io.training.boot.features.junit5.CompareService;
import io.training.boot.features.junit5.SomeService;
import io.training.boot.features.junit5.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * 由于mvn test无法测试到@TestFactory
 * <pre>
 *     mvn test -Dtest=io.training.boot.features.junit5.test.Junit5TestFactory#*
 * </pre>
 *
 * 使用上述指令可以测试
 *
 *
 */
@Slf4j
@SpringBootTest
public class Junit5TestFactory {
    @Autowired
    SomeService someService;
    @Autowired
    CompareService compareService;
    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        // 第一个参数表示测试CASE名称，显示名称。 第二个参数测试表达式。
        List<DynamicTest> all = new ArrayList<>();
        for(int i = 0; i < 5; i++) {

        }

        all.add(dynamicTest("1st dynamic test===", () -> assertTrue(true)));
        all.add(dynamicTest("2st dynamic test===", () -> assertEquals(4, 2 * 2)));

        return all;
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsWithSpring() {
        // 第一个参数表示测试CASE名称，显示名称。 第二个参数测试表达式。
        List<DynamicTest> all = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            User user = someService.getUser();
            log.info("user:{}", user);
            all.add(dynamicTest(user.getName(), () -> assertTrue(compareService.compare(user))));
        }
        return all;
    }


}
