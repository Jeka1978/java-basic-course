package my_junit;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {

    @SneakyThrows
    public void runAllTestsOfClass(String className) {
        Class<?> aClass = Class.forName(className);

        Optional<Method> beforeMethodOptional = Arrays.stream(aClass.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(RunBeforeEachTest.class))
                .findAny();

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")) {
                Object testObj = aClass.getDeclaredConstructor().newInstance();
                beforeMethodOptional.ifPresent(beforeMethod -> TestRunner.runMethod(beforeMethod, testObj));
                TestRunner.runMethod(method,testObj);
//                TestRunner.runMethod(afterMethod,testObj);
            }
        }


    }

    @SneakyThrows
    public static void runMethod(Method method, Object o){
        method.invoke(o);
    }

}
