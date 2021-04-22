package anonimuse_inner_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame2 extends JFrame {

    int x =12;


    public ColorFrame2(int counter) {


        x++;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setSize(400, 400);
        JButton button = new JButton("click me");

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(counter+ColorFrame2.this.x);
            }
        });


        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
    }
}
