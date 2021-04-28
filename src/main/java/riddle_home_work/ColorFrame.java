package riddle_home_work;

import javax.swing.*;
import java.awt.*;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(int counter) throws HeadlessException {
        JButton button = new JButton("click to print counter");
        button.addActionListener(e -> {
            System.out.println(counter);
            //todo counter++ should work, but it will never work in java.
            //todo you need to make some work around
        });

        getContentPane().add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame(666);
        new ColorFrame(73);
    }
}
