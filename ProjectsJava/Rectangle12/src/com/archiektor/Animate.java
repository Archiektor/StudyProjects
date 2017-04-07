package com.archiektor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Archiektor on 26.02.2017.
 */
public class Animate {
    int x = 1;
    int y = 1;

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //
        MyDrawP drawP = new MyDrawP();

        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for (int i = 0; i < 124; i++, y++, x++) {
            //why ?
            x++;
            drawP.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
        }
    }

    class MyDrawP extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 270);

            g.setColor(Color.blue);
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
        }
    }
}
