package constants_example;

import model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person());
        persons.add(new Person());

        Person o = persons.get(1);


        var list = new ArrayList<String>();

        list.add("ad");
    }
}
