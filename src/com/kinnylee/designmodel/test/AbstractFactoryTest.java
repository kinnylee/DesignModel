package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.abstractfactory.*;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/9/1.
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
        Creator2 creator2 = new ConcreteCreator1();
//        Creator2 creator3 = new ConcreteCreator2();
        ProductA productA = creator2.factoryA();
    }
}
