package com.kinnylee.designmodel.observer;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class ConcreteObserver implements IObserver {

    @Override
    public void update() {
        System.out.println("I am notified...");
    }
}
