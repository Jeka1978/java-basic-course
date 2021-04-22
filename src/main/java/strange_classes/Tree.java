package strange_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Tree {
    private String name;
    private List<Leafe> leafes = new ArrayList<>();



    public Tree(int numberOfLeaves) {
        for (int i = 0; i < numberOfLeaves; i++) {
            leafes.add(new Leafe());
        }
    }

    private class Leafe {

        private String color;


        public void changeNameOfTree(){
            Tree.this.name = "Very old tree";
        }
    }
}




