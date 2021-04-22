package collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class EvenNumberIterable implements Iterable{
    @Override
    public Iterator iterator() {
        return new EvenNumbersIterator();
    }
}
