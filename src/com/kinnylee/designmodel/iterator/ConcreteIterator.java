package com.kinnylee.designmodel.iterator;

/**
 * Created by lijl-c on 2016/8/24.
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate concreteAggregate;
    private int size = 0;
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate aggregate){
        this.concreteAggregate = aggregate;
        size = concreteAggregate.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < size){
            ++index;
        }
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getElement(index);
    }
}
