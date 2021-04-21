package inheritance_visibility;

/**
 * @author Evgeny Borisov
 */
public class Creature {
    private String name;

    public void check(String name) {

        System.out.println(this.name);
    }

    public void callBreath() {
        breathe();
    }

    public void breathe() {
        System.out.println("I'm breathing");
    }


    public void printNames(int x, String... names) {
        String[] strings = names;
    }
}
