package animals;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnimalDoctor animalDoctor = new AnimalDoctor();
        animalDoctor.treat(new Dog());
    }
}
