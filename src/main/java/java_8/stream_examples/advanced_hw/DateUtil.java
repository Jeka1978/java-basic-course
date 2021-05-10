package java_8.stream_examples.advanced_hw;

import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class DateUtil {

    public static void printBlackFridaySorted(int startYear, int endYear) {
//        IntStream.range(startYear,endYear)

        //todo finish this
        LocalDate startDate = LocalDate.of(1, 1, startYear);

        Stream<LocalDate> stream = Stream.iterate(startDate, localDate -> localDate.plusDays(1));
    }
}
