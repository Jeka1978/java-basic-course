package reflections;

/**
 * @author Evgeny Borisov
 */
public class Airplane {
    private int speed;
    private Integer numberOfPassengers;
    private String name;


    public void fly(int speed) {

    }

    public int getSpeed() {
        return speed;
    }

    public void setMaxSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
