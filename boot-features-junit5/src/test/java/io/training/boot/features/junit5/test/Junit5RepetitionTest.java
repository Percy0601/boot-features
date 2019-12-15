package io.training.boot.features.junit5.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
 * <pre>
 *     JUnit Platform 作为在JVM上启动测试框架的基础。
 * 它还定义了TestEngine API，用于开发在平台上运行的测试框架。
 * 此外，该平台提供了一个控制台启动器，用于从命令行启动平台，并为Gradle和Maven构建插件，以及一个基于JUnit 4的运行器，用于在平台上运行任何TestEngine。
 *
 * JUnit Jupiter 是新的编程模型和扩展模型的组合，用于在JUnit 5中编写测试和扩展。
 * Jupiter子项目为运行基于平台的测试提供了一个测试引擎。
 *
 * JUnit Vintage 为在平台上运行基于JUnit 3和JUnit 4的测试提供了一个测试引擎。
 *
 *
 * </pre>
 */
@Slf4j
public class Junit5RepetitionTest {

    @BeforeEach
    void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();
        log.info(String.format("About to execute repetition %d of %d for %s", //
                currentRepetition, totalRepetitions, methodName));
    }


    @RepeatedTest(5)
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
        assertEquals(5, repetitionInfo.getTotalRepetitions());
    }

}
