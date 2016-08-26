package com.kinnylee.example.test;

import com.kinnylee.example.audioplayer.*;
import org.junit.Test;

import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.StateEditable;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

/**
 * Created by lijl-c on 2016/8/26.
 */
public class AudioPlayerTest {

    @Test
    public void test(){
        AudioPlayer audioPlayer = new AudioPlayer();
        Command play = new PlayCommand(audioPlayer);
        Command stop = new StopCommand(audioPlayer);
        Command rewind = new RewindCommand(audioPlayer);
        Keypad keypad = new Keypad(play, stop, rewind);
        keypad.play();
        keypad.rewind();
        keypad.stop();
    }

    @Test
    public void test2(){
        AudioPlayer audioPlayer = new AudioPlayer();
        Command play = new PlayCommand(audioPlayer);
        Command stop = new StopCommand(audioPlayer);
        Command rewind = new RewindCommand(audioPlayer);
        MacroCommand macroCommand = new MacroAudioCommand();
        macroCommand.add(play);
        macroCommand.add(stop);
        macroCommand.add(rewind);
        macroCommand.execute();
    }
}
