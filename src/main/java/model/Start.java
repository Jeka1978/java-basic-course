package model;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {


        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog("input your choice"));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println(choice+ " was correct");
        }


    }
}
