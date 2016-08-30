package com.kinnylee.designmodel.visitor;

/**
 * Created by lijl-c on 2016/8/29.
 */
public interface Visitor {

    void visit(NodeA nodeA);
    void visit(NodeB nodeB);
}
