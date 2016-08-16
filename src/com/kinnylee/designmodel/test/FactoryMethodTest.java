package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.factory.FactoryMethod;
import com.kinnylee.designmodel.factory.intf.IFruit;
import com.kinnylee.designmodel.factory.intf.ITest;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class FactoryMethodTest implements ITest{

    @Override
    @Test
    public void testCreateFruit(){
        IFruit fruit = FactoryMethod.createFactory().createFruit();
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
