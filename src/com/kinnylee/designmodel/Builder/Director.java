package com.kinnylee.designmodel.builder;

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
