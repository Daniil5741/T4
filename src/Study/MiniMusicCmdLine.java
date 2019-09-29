package Study;

import javax.sound.midi.*;
import java.util.Scanner;


public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int instrument = scanner.nextInt();
//            int note = scanner.nextInt();
//            mini.play(instrument, note);
//        }
mini.play(30,50);

    }

    public void play(int instrument, int note) {
        try {

            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;


            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent chageInstrument = new MidiEvent(first, 1);
            track.add(chageInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 16);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);


            ShortMessage first1 = new ShortMessage();
            first1.setMessage(192, 1, (instrument+30), 0);
            MidiEvent chageInstrument1 = new MidiEvent(first1, 16);
            track.add(chageInstrument1);

            ShortMessage a1 = new ShortMessage();
            a1.setMessage(144, 1, note+30, 100);
            MidiEvent noteOn1 = new MidiEvent(a1, 16);
            track.add(noteOn1);

            ShortMessage b1 = new ShortMessage();
            b1.setMessage(128, 1, note+30, 16);
            MidiEvent noteOff1 = new MidiEvent(b1, 32);
            track.add(noteOff1);

            player.setSequence(seq);

            player.start();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Нота не была проиграна");
        }


    }


}
