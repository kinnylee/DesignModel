package com.kinnylee.designmodel.state;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class Context {

    private State state;

    public void simpleOperator(){
        state.simpleOperator();
    }

    public void setState(State state){
        this.state = state;
    }
}
