package Study;

import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BeatBoxTesting implements ActionListener {
    JTextArea text;


    public static void main(String[] args) {
        BeatBoxTesting gui = new BeatBoxTesting();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panelLeft = new JPanel();
        JPanel panel = new JPanel();
        JPanel[] panelLeftBoxX = new JPanel[16];
        JPanel panelButton = new JPanel();

        panelButton.setLayout(new BoxLayout(panelButton,BoxLayout.Y_AXIS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));

        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton tempoUp = new JButton("Tempo UP");
        JButton tempoDown = new JButton("Tempo Down");

        panelButton.add(start);
        panelButton.add(stop);
        panelButton.add(tempoUp);
        panelButton.add(tempoDown);
        panel.add(panelLeft);

        frame.setContentPane(panel);

        JLabel[] labels = new JLabel[16];
        JCheckBox[][] checkBoxes = new JCheckBox[16][16];
        for (int i = 0; i < 16; i++) {
            labels[i] = new JLabel("Label " + Integer.toString(i));
            panelLeftBoxX[i] = new JPanel();
            panelLeftBoxX[i].add(labels[i]);
            for (int j = 0; j < 16; j++) {
                checkBoxes[i][j] = new JCheckBox();
                panelLeftBoxX[i].add(checkBoxes[i][j]);
            }
            panelLeft.add(panelLeftBoxX[i]);
        }


        frame.setSize(500, 500);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        text.append("button clicked \n");
    }
}