package com.kinnylee.designmodel.mediator;

/**
 * Created by lijl-c on 2016/8/30.
 */
public class ColleageA extends Colleage {

    public ColleageA(Mediator mediator){
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("This is an action from ColleageA");
    }
}
