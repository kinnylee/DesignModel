package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.strategy.ConcreteStrategy;
import com.kinnylee.designmodel.strategy.Context;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class StrategyTest {

    @Test
    public void test(){
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy());
        context.contextInterface();
    }
}
