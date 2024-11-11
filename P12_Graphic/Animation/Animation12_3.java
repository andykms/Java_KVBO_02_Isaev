import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Animation12_3{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        JPanel panel = new JPanel() {
            private int angle = 0;
            int r = 10;
            float b = 1;
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random rand = new Random();
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;

                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.getHSBColor((float)b/100, (float)b/100, (float)b/100));
                g2d.rotate(Math.toRadians(angle), centerX, centerY);
                g2d.fillRect(centerX, centerY, 5* r, 5*r);

                angle += 5;
                if (angle >= 360) {
                    angle = 0;
                }
                r++;
                b+=0.2;
                if(r == 200){
                  r = 1;
                }
                if(b == 15) {
                  b = 1;
                }
            }
        };
        frame.add(panel);

        Timer timer = new Timer(32, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
            }
        });
        timer.start();
    }
}