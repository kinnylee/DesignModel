package com.kinnylee.designmodel.flyweight;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class ConcreteFlyweight extends Flyweight {

    private Character innerState;

    public ConcreteFlyweight(Character innerState){
        this.innerState = innerState;
    }

    @Override
    public void operator(String state) {
        System.out.println("inner state: " + innerState);
        System.out.println("outer state: " + state);
    }
}
