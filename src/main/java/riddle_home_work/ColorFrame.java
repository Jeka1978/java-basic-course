package riddle_home_work;

import java_8.Action;

import javax.swing.*;
import java.awt.HeadlessException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public void setAction(Action action) {

    }

    public void setAction(Consumer consumer) {

    }

    public static void main(String[] args) {
        new ColorFrame(new int[]{12}).setAction((Action) o -> System.out.println(o));
    }










    public ColorFrame(final int[] counter) throws HeadlessException {
        AtomicInteger integer = new AtomicInteger(12);
        int i = integer.addAndGet(10);
        JButton button = new JButton("click to print counter");
        button.addActionListener(e -> {
            System.out.println(counter[0]++);
            //todo counter++ should work, but it will never work in java.
            //todo you need to make some work around
        });

        getContentPane().add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }


}
