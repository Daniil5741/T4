package Study;

import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {
    JButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I ahve been clicked");
    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);



    }


}
