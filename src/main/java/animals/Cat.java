package animals;

/**
 * @author Evgeny Borisov
 */
public class Cat implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("mau mau");
    }
}
