package com.kinnylee.designmodel.visitor;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class NodeA extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operatorA(){
        return "NodeA is visited";
    }
}
