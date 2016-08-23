package com.kinnylee.designmodel.observer;

import java.util.Observer;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class ConcreteSubject extends Subject {

    public void change(String state) {
        notifyObservers();
        System.out.println("change state...");
    }
}
