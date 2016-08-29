package com.kinnylee.designmodel.memento;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class Caretaker {

    private MementoIF memento;

    public MementoIF retrieveMemento(){
        return memento;
    }

    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }
}
