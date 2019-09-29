package Study;

import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TextAreal implements ActionListener {
    JTextArea text;
    JCheckBox checkBox;

    public static void main(String[] args) {
        TextAreal gui = new TextAreal();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("Just Click it");
        checkBox = new JCheckBox("Is checked");

        button.addActionListener(this);
       checkBox.setBorderPainted(false);
        text = new JTextArea(20, 20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.WEST, checkBox);

        frame.setSize(350, 300);
        frame.setVisible(true);

    }

    public void itemStateChanged(ItemEvent ev) {
        String onOrOff = "off";
        if (checkBox.isSelected()) onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.append("button clicked \n");
    }
}
