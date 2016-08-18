package com.kinnylee.designmodel.decorator;

import com.kinnylee.designmodel.composite.*;

import java.io.DataOutputStream;
import java.io.FileInputStream;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class Decorator implements IComponent {

    private IComponent component;

    public Decorator(IComponent component){
        this.component = component;
    }

    @Override
    public void simpleOperator() {
        component.simpleOperator();
        System.out.println("DecoratorComponent...");
    }
}
