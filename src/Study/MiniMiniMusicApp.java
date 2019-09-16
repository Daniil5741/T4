package Study;

import javax.sound.midi.*;


public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(192, 1, 50, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 120, 100);
            MidiEvent noteOff = new MidiEvent(b, 50);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Нота не была проиграна");
        }


    }




}
