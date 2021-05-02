package exam;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class QuoterProducer {


    @SneakyThrows
    public Quote produce() {
        long id = System.nanoTime();
        BufferedReader reader = new BufferedReader(new FileReader("data/quotes.txt"));
        List<String> list = reader.lines()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(list);
        return null;
    }
}




