package heroes;

/**
 * @author Evgeny Borisov
 */
public class Elf extends AbstractHero {

    public Elf() {
        hp=10;
        power = 10;
    }

    @Override
    public void kick(Hero enemy) {
        if (power > enemy.getPower()) {
            enemy.die();
        }else {
            enemy.decreasePower(1);
        }
    }


}

