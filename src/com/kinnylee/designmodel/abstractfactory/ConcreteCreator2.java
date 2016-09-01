package com.kinnylee.designmodel.abstractfactory;

/**
 * Created by lijl-c on 2016/9/1.
 */
public class ConcreteCreator2 implements Creator2 {
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
