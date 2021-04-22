package collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class EvenNumbersIterator implements Iterator {
    private int current = 0;

    @Override
    public boolean hasNext() {
        return current<Integer.MAX_VALUE;
    }

    @Override
    public Object next() {
        return current += 2;
    }
}



