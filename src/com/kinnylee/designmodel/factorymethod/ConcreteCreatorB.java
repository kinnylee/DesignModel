package com.kinnylee.designmodel.factorymethod;

/**
 * Created by lijl-c on 2016/9/1.
 */
public class ConcreteCreatorB implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProductB();
    }
}
