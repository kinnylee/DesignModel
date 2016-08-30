package com.kinnylee.designmodel.visitor;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(NodeA nodeA) {
        System.out.println(nodeA.operatorA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println(nodeB.operatorB());
    }
}
