package heroes;

import lombok.Setter;

import static heroes.RandomUtil.getNumberBetween;

/**
 * @author Evgeny Borisov
 */
public class Knight extends AbstractHero {

    @Setter
    private WeaponStrategy weapon = new Sword(this);

    public Knight() {
        hp = getNumberBetween(2, 12);
        power = getNumberBetween(2, 12);
    }

    @Override
    public void kick(Hero enemy) {
        weapon.kick(enemy);
    }
}






