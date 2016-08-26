package com.kinnylee.example.audioplayer;

/**
 * Created by lijl-c on 2016/8/26.
 */
public interface MacroCommand extends Command {

    void execute();
    void add(Command command);
    void remove(Command command);
}
