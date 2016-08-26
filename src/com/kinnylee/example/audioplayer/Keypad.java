package com.kinnylee.example.audioplayer;

/**
 * Created by lijl-c on 2016/8/26.
 */
public class Keypad {

    private Command playCmd;
    private Command rewindCmd;
    private Command stopCmd;

    public Keypad(Command play, Command stop, Command rewind){
        this.playCmd = play;
        this.stopCmd = stop;
        this.rewindCmd = rewind;
    }

    public void play(){
        playCmd.execute();
    }

    public void stop(){
        stopCmd.execute();
    }

    public void rewind(){
        rewindCmd.execute();
    }
}
