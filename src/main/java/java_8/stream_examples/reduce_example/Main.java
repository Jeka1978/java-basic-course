package java_8.stream_examples.reduce_example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Optional<Money> optional = Stream.of(new Money("USD", 100), new Money("USD", 200), new Money("USD", 150))
                .reduce(Money::plusMoney);

        optional.ifPresent(System.out::println);


        String sentence = List.of("Java", "Scala", "Python", "C#").stream()
                .peek(System.out::println)
                .reduce((s, s2) -> s + "," + s2)
                .get();
        System.out.println("sentence = " + sentence);




    }
}
