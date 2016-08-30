package com.kinnylee.designmodel.mediator;

/**
 * Created by lijl-c on 2016/8/30.
 */
public class ColleageB extends Colleage {

    public ColleageB(Mediator mediator){
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("This is an action from ColleageB");
    }
}
