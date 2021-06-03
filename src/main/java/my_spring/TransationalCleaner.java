package my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class TransationalCleaner implements Cleaner {
    @InjectByType
    private CleanerImpl cleaner;


    @Override
    public void clean() {
        System.out.println("Transaction opened");
        cleaner.clean();
        System.out.println("Transaction closed");
    }
}
