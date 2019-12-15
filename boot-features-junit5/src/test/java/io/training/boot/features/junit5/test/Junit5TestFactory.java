package io.training.boot.features.junit5.test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class Junit5TestFactory {


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
        for(int i = 0; i < 5; i++) {

        }

        all.add(dynamicTest("1st dynamic test", () -> assertTrue(true)));
        all.add(dynamicTest("2st dynamic test", () -> assertEquals(4, 2 * 2)));

        return all;
    }


}
