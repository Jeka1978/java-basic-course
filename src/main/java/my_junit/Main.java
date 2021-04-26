package my_junit;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.runAllTestsOfClass("my_junit.TestClass");
    }
}
