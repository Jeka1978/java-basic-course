package java_8.stream_examples.sort_examples;

import java_8.stream_examples.flat_map_example.Beer;

import java.util.Comparator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        List.of(new Beer("T",120),new Beer("K",13))
                .stream()
                .sorted()
                .forEach(System.out::println);

        List.of("java","scala","C#")
                .stream()
                .sorted((o1, o2) -> o2.length()-o1.length())
//                .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
