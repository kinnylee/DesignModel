package com.kinnylee.designmodel.dm;

import com.kinnylee.designmodel.abstra.Builder;
import com.kinnylee.designmodel.extend.ConcreteBuilder;

/**
 * Created by lijl-c on 2016/8/13.
 */
public class Director {
    private Builder builder;

    public void construct(){
        builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
    }
}
