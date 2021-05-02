package java_8.method_reference;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {

    public Dog(int x) {
    }

    public Dog() {
    }

    @Override
    public void makeVoice() {
        System.out.println("gav gav");
    }
}
