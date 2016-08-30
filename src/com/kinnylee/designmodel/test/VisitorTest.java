package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.visitor.*;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class VisitorTest {

    @Test
    public void test(){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new NodeA());
        objectStructure.add(new NodeB());
        Visitor visitor = new VisitorA();
        objectStructure.action(visitor);
    }
}
