package java_8;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {


    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        forEachWithDelay(list,2000,integer -> System.out.println(integer));
    }


    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> action) {
        for (T t : list) {
            action.accept(t);
            Thread.sleep(delay);
        }

    }


    public static <T> int countDuplicates(List<T> list, T t, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.myEquals(t, t1)) {
                counter++;
            }
        }
        return counter;
    }
}
