package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.memento.Caretaker;
import com.kinnylee.designmodel.memento.Originator;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class MementoTest {

    @Test
    public void test(){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("off");
        originator.restoreMemento(caretaker.retrieveMemento());
    }
}
