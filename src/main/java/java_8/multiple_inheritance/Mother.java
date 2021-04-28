package java_8.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {

    default void talkToChildren(){
        System.out.println("CHILDREN, COME TO ME!!!!!!!!!!!!!!!!!");
    }
}
