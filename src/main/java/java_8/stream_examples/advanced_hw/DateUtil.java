package java_8.stream_examples.advanced_hw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class DateUtil {

    public static void main(String[] args) {



        printBlackFridaySorted(1900,1930);
    }

    public static void printBlackFridaySorted(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear, 1, 13);
        LocalDate endDate = LocalDate.of(endYear, 1, 13);

        Map<Integer, Long> map = Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .takeWhile(localDate -> localDate.isBefore(endDate))
                .collect(groupingBy(LocalDate::getYear, counting()));

        map.entrySet().stream().sorted((o1, o2) -> (int) (o2.getValue() - o1.getValue()))
                .forEach(System.out::println);
//        IntStream.range(startYear,endYear)


    }
}
