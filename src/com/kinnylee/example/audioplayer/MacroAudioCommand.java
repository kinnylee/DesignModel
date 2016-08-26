package com.kinnylee.example.audioplayer;

import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/26.
 */
public class MacroAudioCommand implements MacroCommand {

    private Vector<Command> commandList = new Vector<>();

    @Override
    public void execute() {
        for(int i = 0; i < commandList.size(); ++i){
            Command command = commandList.get(i);
            command.execute();
        }
        System.out.println("Finished all command");
    }

    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }
}
