package com.kinnylee.designmodel.dm;

import com.kinnylee.designmodel.intf.IFactory;
import com.kinnylee.designmodel.model.AppleFactory;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class FactoryMethod {

    public static IFactory createFactory(){
        return new AppleFactory();
    }

}
