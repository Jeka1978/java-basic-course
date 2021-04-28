package java_8;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Equalator<T> {

    boolean myEquals(T t1, T t2);


}
