package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.template.AbstractClasss;
import com.kinnylee.designmodel.template.ConcreteClass;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class TemplateTest {

    @Test
    public void test(){
        AbstractClasss abstractClasss = new ConcreteClass();
        abstractClasss.templateMethod();
    }
}
