package heroes;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */

@Setter
@Getter
public abstract class AbstractHero implements Hero {
    protected int power;
    protected int hp;


    @Override
    public void decreasePower(int delta) {
        power-=delta;
    }

    @Override
    public void decreaseHp(int delta) {
        hp-=delta;
    }

    @Override
    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public void die() {
        hp=0;
    }


}



