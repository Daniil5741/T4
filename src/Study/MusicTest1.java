package Study;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequence sequence = (Sequence) MidiSystem.getSequencer();
            Sequencer player=MidiSystem.getSequencer();
            player.open();
           // Sequence seq=new Sequence(timing,4);
          //  Track t=seq.createTrack();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
        System.out.println("Мы получили синтезатор");

    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
//        try {
//            Sequence sequence = (Sequence) MidiSystem.getSequencer();
//            System.out.println("Мы получили синтезатор");
//        }catch (MidiUnavailableException ex){
//            System.out.println("Неудача");
//        }

    }
}
