package com.kinnylee.designmodel.abstractfactory;

/**
 * Created by lijl-c on 2016/9/1.
 */
public class ConcreteCreator1 implements Creator2 {
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
