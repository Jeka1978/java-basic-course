package singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public class MySingleton {
    private static MySingleton instance = new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }

}
