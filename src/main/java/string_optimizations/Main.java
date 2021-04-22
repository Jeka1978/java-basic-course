package string_optimizations;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {




        StringBuilder str = new StringBuilder();
        for (String arg : args) {
            str.append(arg);
        }

        String s = str.toString();
        System.out.println(s.toUpperCase());
    }
}
