package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.simplefactory.SimpleFactory;
import com.kinnylee.designmodel.simplefactory.IFruit;
import com.kinnylee.designmodel.factory.intf.ITest;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class SimpleFactoryTest implements ITest{

    @Override
    @Test
    public void testCreateFruit() {
        IFruit fruit = SimpleFactory.createFruit("apple");
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
