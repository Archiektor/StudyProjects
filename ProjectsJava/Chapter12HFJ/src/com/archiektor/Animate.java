package com.archiektor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Archiektor on 22.02.2017.
 */
public class Animate extends JPanel {
    Graphics2D g2d;
    private int x;
    private int y;

    public void go() {

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g2d.setColor(randomColor);

        MyDrawPanel panel = new MyDrawPanel();
    }

    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g2d = (Graphics2D) g;
            x = (int) (Math.random() * 250);
            y = (int) (Math.random() * 250);
            g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
            g2d.fillOval(x, y, 100, 100);
        }
    }
}
