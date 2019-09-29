package Study;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    int red = 2;
    int green = 100;
    int blue = 200;

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }


    public void setRed(int red) {
        this.red = red;
    }

    @Override
    protected void paintComponent(Graphics g) {

        Color colorRandom = new Color(red, green, blue);
       this.setBlue((int) (Math.random() * 255));
        this.setGreen((int) (Math.random() * 255));
        this.setRed((int) (Math.random() * 255));
//        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);
//        g2d.setPaint(gradientPaint);
        // g2d.fillOval(70, 70, 100, 100);
        g.setColor(colorRandom);
        g.fillRect(1, 1, 200, 200);
//        g.setColor(Color.WHITE);
//     g.fillOval(50,50,70,100);
    }

}
