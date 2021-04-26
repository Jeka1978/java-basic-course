package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class RemoveFromCollectionViaRunningMain {
    public static void main(String[] args) {
        List<String> commandos = new ArrayList<>(List.of(
                "Arnold",
                "Stallone",
                "Chuck Norris",
                "Bruce lee"

        ));


        commandos.removeIf(commando -> commando.equalsIgnoreCase("Arnold"));

        System.out.println(commandos);

    }











}
