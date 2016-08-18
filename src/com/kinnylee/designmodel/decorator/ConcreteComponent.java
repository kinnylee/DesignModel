package com.kinnylee.designmodel.decorator;

import com.kinnylee.designmodel.composite.*;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void simpleOperator() {
        System.out.println("concreteComponet...");
    }
}
