package com.kinnylee.designmodel.decorator;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void simpleOperator() {
        System.out.println("concreteComponet...");
    }
}
