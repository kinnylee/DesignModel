package com.kinnylee.designmodel.singleton;

/**
 * Created by lijl-c on 2016/8/13.
 */
public class EagerSingleton {

    private static final EagerSingleton m_instance = new EagerSingleton();

    EagerSingleton(){}

    EagerSingleton getInstance(){
        return m_instance;
    }
}
