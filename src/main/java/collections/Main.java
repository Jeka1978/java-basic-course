package collections;

import lombok.SneakyThrows;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        EvenNumberIterable iterable = new EvenNumberIterable();
        Iterator iterator = iterable.iterator();

        while (iterator.hasNext()) {
            Thread.sleep(100);
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
