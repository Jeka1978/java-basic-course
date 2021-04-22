package howework;

/**
 * @author Evgeny Borisov
 */


//todo you can use only array []
public interface EpamList<E> {
    void add(E o);
    int size();

    boolean remove(int i);


    //bonus
    boolean remove(E o);

    E get(int index);


    void printAllContext();
}
