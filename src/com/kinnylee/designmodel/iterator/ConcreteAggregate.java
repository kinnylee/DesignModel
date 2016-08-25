package com.kinnylee.designmodel.iterator;

/**
 * Created by lijl-c on 2016/8/24.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objects = {"a", "b", "c", "d", "e"};

    public Iterator crerateIterator(){
        return new ConcreteIterator(this);
    }

    public Object getElement(int index){
        if(index < objects.length){
            return objects[index];
        }
        return null;
    }
    public int size(){
        return objects.length;
    }
}
