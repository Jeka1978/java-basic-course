package my_junit;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {

    @SneakyThrows
    public void runAllTestsOfClass(String className) {
        Class<?> aClass = Class.forName(className);
        //todo finish this by JUnit convension
    }
}
