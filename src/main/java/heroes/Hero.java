package heroes;

/**
 * @author Evgeny Borisov
 */
public interface Hero {
    void kick(Hero enemy);

    boolean isAlive();

    int getPower();
    int getHp();

    void decreasePower(int delta);
    void decreaseHp(int delta);
    void die();


}





