package com.kinnylee.designmodel.visitor;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class ObjectStructure {

    private Vector<Node> nodes;

    private Node node;

    public ObjectStructure(){
        nodes = new Vector<>();
    }

    public void add(Node node){
        nodes.add(node);
    }

    public void action(Visitor visitor){

        for(Iterator iterator = nodes.iterator(); iterator.hasNext(); ){
            Node node = (Node)iterator.next();
            node.accept(visitor);
        }
    }
}
