package heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends AbstractHero {
    public Hobbit() {
        hp=3;
        power=0;
    }

    @Override
    public void kick(Hero enemy) {
        cry();
    }

    private void cry() {

        System.out.println("AAAAAAAAAAAAaaaaauuuuuuuuuuuuuu");
    }
}
