package com.kinnylee.designmodel.factory;

import com.kinnylee.designmodel.factory.intf.IFactory;
import com.kinnylee.designmodel.factory.model.AppleFactory;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class FactoryMethod {

    public static IFactory createFactory(){
        return new AppleFactory();
    }

}
