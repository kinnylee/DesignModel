package com.kinnylee.designmodel.command;

/**
 * Created by lijl-c on 2016/8/25.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
