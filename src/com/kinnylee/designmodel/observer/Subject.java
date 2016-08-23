package com.kinnylee.designmodel.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/23.
 */
abstract public class Subject {

    private Vector<IObserver> observers = new Vector<>();

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    public Enumeration observers(){
        return (Enumeration) ((Vector<IObserver>)observers.clone()).elements();
    }

    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((IObserver)enumeration.nextElement()).update();
        }
    }
}
