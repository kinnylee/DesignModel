package com.kinnylee.designmodel.proxy;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class RealSubject extends Subject {

    public RealSubject(){

    }

    @Override
    public void request() {
        System.out.println("From real subject...");
    }
}
