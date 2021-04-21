package contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class Worker extends Human {
    private int salary;

    public Worker(String name,int salary) {
        super(name);
        this.salary = salary;
    }
}
