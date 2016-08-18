package com.kinnylee.designmodel.singleton;

/**
 * Created by lijl-c on 2016/8/13.
 */
public class LazySingleton {

    private static LazySingleton m_instance = null;

    public static LazySingleton  getInstance(){
        if(null == m_instance){
            m_instance = new LazySingleton();
        }
        return  m_instance;
    }
}
