package com.kinnylee.designmodel.model;

import com.kinnylee.designmodel.intf.IFactory;
import com.kinnylee.designmodel.intf.IFruit;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class AppleFactory implements IFactory {

    @Override
    public IFruit createFruit() {
        return new Apple();
    }
}
