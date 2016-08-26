package com.kinnylee.example.audioplayer;

import com.kinnylee.designmodel.command.*;

/**
 * Created by lijl-c on 2016/8/26.
 */
public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
