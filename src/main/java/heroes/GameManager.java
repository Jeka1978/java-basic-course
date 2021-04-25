package heroes;

/**
 * @author Evgeny Borisov
 */
public class GameManager {


    private HeroFactory heroFactory = new HeroFactory();

    public void fightWithRandomHeroes() {
        Hero h1 = heroFactory.createRandomHero();
        Hero h2 = heroFactory.createRandomHero();

        while (h1.isAlive() && h2.isAlive()) {
            h1.kick(h2);
            h2.kick(h1);
        }
        if (h1.isAlive()) {
            System.out.println(h1.getClass().getSimpleName() + " won");
        } else {
            System.out.println(h2.getClass().getSimpleName() + " won");
        }
    }
}
