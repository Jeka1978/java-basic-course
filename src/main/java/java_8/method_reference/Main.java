package java_8.method_reference;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Point> points = List.of(
                Point.builder().x(2).y(4).build(),
                Point.builder().x(2).y(4).build(),
                Point.builder().x(2).y(4).build(),
                Point.builder().x(2).y(4).build()
        );

        points.forEach(str -> Point.printPoint(str));
    }
}














