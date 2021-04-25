package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person implements Serializable {
//    private static final long serialversionUID = 456;
    private String name;
    private transient int age;

    public void a(){}





    public static void printName(){
        Person person = new Person();
        System.out.println(person.getName());
    }

    public Person withName(String name) {
        return this.name == name ? this : new Person(name, this.age);
    }

    public Person withAge(int age) {
        return this.age == age ? this : new Person(this.name, age);
    }
}








