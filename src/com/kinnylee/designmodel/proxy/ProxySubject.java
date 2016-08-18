package com.kinnylee.designmodel.proxy;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class ProxySubject extends Subject {

    private RealSubject realSubject;

    public ProxySubject(){

    }

    public void preRequest(){
        System.out.println("proxy pre request...");
    }

    public void postRequest(){
        System.out.println("proxy post request...");
    }

    @Override
    public void request() {
        preRequest();

        if(null == realSubject){
            realSubject = new RealSubject();
        }
        realSubject.request();

        postRequest();
    }
}
