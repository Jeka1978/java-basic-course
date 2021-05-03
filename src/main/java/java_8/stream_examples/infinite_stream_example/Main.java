package java_8.stream_examples.infinite_stream_example;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        DoubleStream.generate(System::nanoTime).limit(10).forEach(System.out::println);
    }
}
