package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.decorator.ConcreteComponent;
import com.kinnylee.designmodel.decorator.Decorator;
import com.kinnylee.designmodel.decorator.IComponent;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class DecoratorTest {

    @Test
    public void test(){
        IComponent component = new Decorator(new ConcreteComponent());
        component.simpleOperator();
    }
}
