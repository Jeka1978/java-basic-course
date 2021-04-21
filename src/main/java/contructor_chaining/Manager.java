package contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class Manager extends Worker {
    private int bonus;

    public Manager(String name, int salary,int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
}
