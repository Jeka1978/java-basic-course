package heroes;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class Sword implements WeaponStrategy {

    private Hero attacker;

    @Override
    public void kick(Hero defender) {
        int damage = RandomUtil.getNumberBetween(0, attacker.getPower());
        String defenderName = defender.getClass().getSimpleName();
        String attackerName = attacker.getClass().getSimpleName();
        System.out.println(attackerName + " kick with a sword to " + defenderName + " for " + damage + "hp");
        defender.decreaseHp(damage);
    }
}
