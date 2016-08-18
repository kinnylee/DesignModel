package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.flyweight.Flyweight;
import com.kinnylee.designmodel.flyweight.FlyweightFactory;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class FlyweightTest {

    @Test
    public void test(){
        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyFactory.factory(new Character('a'));
        flyweight1.operator("first alling...");

        Flyweight flyweight2 = flyFactory.factory(new Character('b'));
        flyweight2.operator("second alling...");

        Flyweight flyweight3 = flyFactory.factory(new Character('a'));
        flyweight3.operator("third alling...");
    }
}
