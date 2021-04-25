package enums;

import model.Person;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args)  {
        User user = new User("Daniel", 28, MaritalStatus.SINGLE);
        User user2 = new User("Moshe", 58, MaritalStatus.MARRIED);

        user.getMaritalStatus().printHebrewDesc();
        user2.getMaritalStatus().printHebrewDesc();

        MaritalStatus status = MaritalStatus.findByDbCode(5);
        System.out.println(status);

    }
}
