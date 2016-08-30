package com.kinnylee.designmodel.visitor;

/**
 * Created by lijl-c on 2016/8/29.
 */
abstract public class Node {

    abstract public void accept(Visitor visitor);
}
