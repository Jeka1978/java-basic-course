package howework;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        EpamList epamList = new EpamListImpl();

        epamList.add("Java");
        epamList.add("Scala");
        epamList.printAllContext();
    }
}
