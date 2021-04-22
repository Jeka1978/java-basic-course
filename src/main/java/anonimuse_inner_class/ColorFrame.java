package anonimuse_inner_class;

import javax.swing.*;
import java.awt.*;
import java.lang.ref.WeakReference;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public ColorFrame(int counter) {


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setSize(400,400);
        JButton button = new JButton("click me");

        button.addActionListener(new MyButtonListener(new WeakReference<>(this)));



        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
    }
}
