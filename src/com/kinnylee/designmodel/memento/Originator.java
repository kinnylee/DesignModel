package com.kinnylee.designmodel.memento;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public Originator(){

    }

    public MementoIF createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(MementoIF mementoIF){
        Memento memento = (Memento)mementoIF;
        setState(memento.getSaveState());
    }

    protected class Memento implements MementoIF{
        private String saveState;

        private Memento(String someState){
            saveState = someState;
        }

        private String getSaveState() {
            return saveState;
        }

        private void setSaveState(String saveState) {
            this.saveState = saveState;
        }
    }
}
