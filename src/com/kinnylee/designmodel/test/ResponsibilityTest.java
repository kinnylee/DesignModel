package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.responsibility.ConcreteHandler;
import com.kinnylee.designmodel.responsibility.Handler;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/25.
 */
public class ResponsibilityTest {

    @Test
    public void test(){
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handlerRequest();
    }
}
