package heroes;

import lombok.experimental.Delegate;

import static heroes.RandomUtil.getNumberBetween;

/**
 * @author Evgeny Borisov
 */
public class King extends AbstractHero {

    @Delegate
    private WeaponStrategy weaponStrategy = new Sword(this);

    public King() {
        hp = getNumberBetween(5, 15);
        power = getNumberBetween(5, 15);
    }

}






