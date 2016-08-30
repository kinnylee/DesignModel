package com.kinnylee.designmodel.mediator;

import com.kinnylee.designmodel.iterator.ConcreteAggregate;

/**
 * Created by lijl-c on 2016/8/30.
 */
public class ConcreteMediator extends Mediator {

    private ColleageA colleageA;
    private ColleageB colleageB;

    public void createConcreteMediator(){
        colleageA = new ColleageA(this);
        colleageB = new ColleageB(this);
    }

    @Override
    public void colleageChanged(Colleage c) {
        colleageA.action();
        colleageB.action();
    }

    public ColleageA getColleageA(){
        return  colleageA;
    }

    public ColleageB getColleageB(){
        return colleageB;
    }
}
