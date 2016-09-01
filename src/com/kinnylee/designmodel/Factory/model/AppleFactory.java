package com.kinnylee.designmodel.factory.model;

import com.kinnylee.designmodel.factory.intf.IFactory;
import com.kinnylee.designmodel.simplefactory.Apple;
import com.kinnylee.designmodel.simplefactory.IFruit;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class AppleFactory implements IFactory {

    @Override
    public IFruit createFruit() {
        return new Apple();
    }
}
