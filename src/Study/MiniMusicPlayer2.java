package Study;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer2 {
    static JFrame f=new JFrame("Мой первый музыкальный клип");
    static MyDrawPanel ml;
    public static void main(String[] args) {
      MiniMusicPlayer2 mini=new MiniMusicPlayer2();
      mini.go();
    }
    public void go(){
        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int [] eventsIWant={127};
            sequencer.addControllerEventListener(new MyDrawPanel(),eventsIWant);
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 0; i < 80; i+=4) {
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,i,100,i+2));

            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(100);

            sequencer.start();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Нота не была проиграна");
        }
    }

    public  static MidiEvent makeEvent(int comd,int chan,int one,int two,int tick){
        MidiEvent event=null;
        try {
            ShortMessage a=new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event=new MidiEvent(a,tick);
        } catch (InvalidMidiDataException e) {

        }
        return  event;
    }


//    @Override
//    public void controlChange(ShortMessage event) {
//        System.out.println("ля");
//    }
    class  MyDrawPanel extends JPanel implements ControllerEventListener{
        boolean msg=false;
        @Override
        public void controlChange(ShortMessage event) {
           msg=true;
           repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            //super.paintComponent(g);

            Graphics2D g2=(Graphics2D) g;
            int r=(int)(Math.random()*250);
            int gr=(int)(Math.random()*250);
            int b=(int)(Math.random()*250);

            g.setColor(new Color(r,gr,b));
            int ht=(int)(Math.random()*120+10);
            int width=(int)(Math.random()*120+10);
            int x=(int)(Math.random()*120+10);
            int y=(int)(Math.random()*120+10);

            g.fillRect(x,y,ht,width);
            msg=false;
        }
    }




}
