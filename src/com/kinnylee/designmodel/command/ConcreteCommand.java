package com.kinnylee.designmodel.command;

/**
 * Created by lijl-c on 2016/8/25.
 */
public class ConcreteCommand implements Command {


    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
