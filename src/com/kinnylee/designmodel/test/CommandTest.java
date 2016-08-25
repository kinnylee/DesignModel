package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.command.Command;
import com.kinnylee.designmodel.command.ConcreteCommand;
import com.kinnylee.designmodel.command.Invoker;
import com.kinnylee.designmodel.command.Receiver;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/25.
 */
public class CommandTest {

    @Test
    public void test(){
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
