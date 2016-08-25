package com.kinnylee.designmodel.responsibility;

/**
 * Created by lijl-c on 2016/8/25.
 */
abstract public class Handler {

    protected Handler successor;

    public abstract void handlerRequest();

    public Handler getSuccessor(){
        return this.successor;
    }

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
}
