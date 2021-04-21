package animals;

import model.Person;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {


    public void appendJava( String str) {

        Person person = new Person();
        Person yaron = person.withAge(12).withName("Yaron");
        String s = str.toLowerCase();
        String newString = str += "Java";
    }


    public void treat(Animal animal) {
        animal.makeVoice();
        animal.makeVoice();

        if (animal instanceof Dog) {
            ((Dog) animal).bringStick();
        }
    }
}
