package Study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleAnimation {

    JButton buttonchange ;

    MyDrawPanel1 myDrawPanel;
    JFrame frame;
    JLabel label;
    int x=150,y=150;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonchange = new JButton("Change circle");
        buttonchange.addActionListener(new ChangeListener());

        myDrawPanel = new MyDrawPanel1();

        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonchange);
        frame.setSize(500, 500);
        frame.setVisible(true);
        for (int i = 0; i < 200; i++) {
//           x-=1;
            y-=1;

           myDrawPanel.repaint();


            try {
                Thread.sleep(40);
            }catch (Exception ex){

            }
        }



    }
    class  MyDrawPanel1 extends  JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            //super.paintComponent(g);
            g.setColor(Color.WHITE);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.orange);
            g.fillOval((int)x,(int)y,100,100);
        }
    }
    class ChangeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            x+=10;
            y+=10;
            frame.repaint();
        }
    }

}
