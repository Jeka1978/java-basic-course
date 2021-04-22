package anonimuse_inner_class;

import lombok.AllArgsConstructor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class MyButtonListener implements ActionListener {

    private WeakReference<ColorFrame> frameWeakReference;

    @Override
    public void actionPerformed(ActionEvent e) {
        ColorFrame colorFrame = frameWeakReference.get();
        colorFrame.getContentPane().setBackground(new Color(255,255,150));
    }
}
