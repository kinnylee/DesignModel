package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.factory.FactoryMethod;
import com.kinnylee.designmodel.factory.intf.IFactory;
import com.kinnylee.designmodel.factorymethod.ConcreteCreatorA;
import com.kinnylee.designmodel.factorymethod.ConcreteCreatorB;
import com.kinnylee.designmodel.factorymethod.Creator;
import com.kinnylee.designmodel.factorymethod.Product;
import com.kinnylee.designmodel.simplefactory.IFruit;
import com.kinnylee.designmodel.factory.intf.ITest;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class FactoryMethodTest implements ITest{

    @Test
    public void test(){
        Creator creatorA = new ConcreteCreatorA();
//        Creator creatorB = new ConcreteCreatorB();
        Product productA = creatorA.factory();

    }

    @Override
    @Test
    public void testCreateFruit(){
        IFactory factory = FactoryMethod.createFactory();
        IFruit fruit = factory.createFruit();
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
