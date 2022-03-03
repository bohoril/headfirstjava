package headfirstjava.chapter12;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    JFrame frame;
    int x = 20;
    int y = 50;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyInnerDrawPanel myInnerDrawPanel = new MyInnerDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, myInnerDrawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            myInnerDrawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception ex) {

            }
        }
    }

    class MyInnerDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.orange);
            g.fillOval(x, y, 100, 100);
        }
    }
}