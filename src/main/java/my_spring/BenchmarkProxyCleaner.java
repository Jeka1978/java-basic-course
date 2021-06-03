package my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class BenchmarkProxyCleaner implements Cleaner {
    @InjectByType
    private CleanerImpl cleaner;


    @Override
    public void clean() {
        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
