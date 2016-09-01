package com.kinnylee.designmodel.factory.model;

import com.kinnylee.designmodel.factory.intf.IFactory;
import com.kinnylee.designmodel.simplefactory.IFruit;
import com.kinnylee.designmodel.simplefactory.Strawberry;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class StrawberryFactory implements IFactory{
    @Override
    public IFruit createFruit() {
        return new Strawberry();
    }
}
