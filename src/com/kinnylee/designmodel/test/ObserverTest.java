package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.observer.ConcreteObserver;
import com.kinnylee.designmodel.observer.ConcreteSubject;
import com.kinnylee.designmodel.observer.IObserver;
import com.kinnylee.designmodel.observer.Subject;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class ObserverTest {

    @Test
    public void test(){
        Subject subject = new ConcreteSubject();
        IObserver observer = new ConcreteObserver();
        subject.attach(observer);
        subject.notifyObservers();
    }
}
