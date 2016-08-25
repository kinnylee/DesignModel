package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.iterator.ConcreteAggregate;
import com.kinnylee.designmodel.iterator.Iterator;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/24.
 */
public class IteratorTest {

    @Test
    public void test() {

        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iter = concreteAggregate.crerateIterator();

        while (!iter.isDone()) {
            System.out.println(iter.currentItem().toString());
            iter.next();
        }
    }
}
