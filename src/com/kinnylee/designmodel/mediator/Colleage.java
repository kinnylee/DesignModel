package com.kinnylee.designmodel.mediator;

/**
 * Created by lijl-c on 2016/8/30.
 */
abstract public class Colleage {

    private  Mediator mediator;

    public Colleage(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    abstract public void action();

    public void change(){
        mediator.colleageChanged(this);
    }
}
