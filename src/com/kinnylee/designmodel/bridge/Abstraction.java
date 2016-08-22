package com.kinnylee.designmodel.bridge;

/**
 * Created by lijl-c on 2016/8/22.
 */
abstract public class Abstraction {

    private Implementor implementor;

    public void operation(){
        implementor.operationImpl();
    }
}
