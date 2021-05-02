package java_8.method_reference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Point {
    private int x;
    private int y;

    public static void printPoint(Point
                                          str) {
        System.out.println(str);
    }

   /* public void printPoint() {
        System.out.println(x+y);
    }*/
}
