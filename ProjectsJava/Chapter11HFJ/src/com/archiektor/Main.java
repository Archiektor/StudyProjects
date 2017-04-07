package com.archiektor;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Main {

    public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException {
        // write your code here

        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if(args.length <2){
            System.out.println("You have forgot something !");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }

        /*MusicTest1 mt = new MusicTest1();
        try {
            mt.play();
        } catch (MidiUnavailableException e) {
            System.out.println("Error !");
            e.printStackTrace();

        }*/

        /*Zero zero = new Zero();
        try {
            a = zero.divide(15, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Re-enter b ! Dividing by zero !");
        } finally {
            System.out.println("Result is = " + a);
        }*/
    }

}
