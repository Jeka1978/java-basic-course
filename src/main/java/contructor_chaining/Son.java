package contructor_chaining;

import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
public class Son extends Parent {

    private final double pi=3.14;


    {
        System.out.println();
    }

    public Son() {
        printPi();
    }

    @Override
    public void printPi() {
        System.out.println(pi);
    }
}
