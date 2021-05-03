package java_8.stream_examples.collect_examples;

import file_examples.Employee;
import java_8.stream_examples.flat_map_example.Beer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
       /* ArrayList<Integer> list = new ArrayList<>();

        IntStream.range(1,100000)
                .parallel()
                .forEach(list::add);
        System.out.println(list.size());*/


        List<Integer> list = IntStream.range(1, 20).boxed().collect(Collectors.toList());
        Map<String, Integer> map = Stream.of(
                new Beer("Tub", 12),
                new Beer("Cal", 11),
                new Beer("Cal", 15))
                .collect(Collectors.toMap(Beer::getName, Beer::getPrice, Integer::sum));

//        map.put("Tub", 111);

        System.out.println("map = " + map);


        Map<Integer, List<Beer>> map1 = Stream.of(
                new Beer("Tub", 12),
                new Beer("Cal", 11),
                new Beer("Corona", 11),
                new Beer("Lef", 15),
                new Beer("Wai", 15))
                .collect(Collectors.groupingBy(Beer::getPrice));

      /*  Map<Integer, Optional<Beer>> map2 = Stream.of(
                new Beer("Tub", 12),
                new Beer("Cal", 11),
                new Beer("Corona", 11),
                new Beer("Lef", 15),
                new Beer("Wai", 15))
                .collect(Collectors.groupingBy(Beer::getPrice, Collectors.minBy(Beer::compareTo)));

*/
      /*  Map<Integer, Long> map1 = Stream.of(
                new Beer("Tub", 12),
                new Beer("Cal", 11),
                new Beer("Corona", 11),
                new Beer("Lef", 15),
                new Beer("Wai", 15))
                .collect(Collectors.groupingBy(Beer::getPrice,Collectors.counting()));*/



        System.out.println("map1 = " + map1);


    }



}
