package java_8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicates() {
        List<String> list = List.of("java", "JAVA", "JaVA", "scala");
        list.forEach(s -> System.out.println(s));

        int answer = ListUtils
                .countDuplicates(list, "java", (t1, t2) -> t1.equalsIgnoreCase(t2));

        Assert.assertEquals(answer,3);

    }
}