package java_8;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Action<T> {
    void doAction(T t);

    boolean equals(Object o);

    String toString();

    int hashCode();


    static void print123() {
        print1();
        print2();
        print3();
    }

    private static void print3() {
        System.out.println(3333);
        System.out.println(3333);
        System.out.println(3333);
    }

    private static void print2() {
        System.out.println(2222);
        System.out.println(2222);
        System.out.println(2222);
    }

    private static void print1() {
        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);
    }

}
