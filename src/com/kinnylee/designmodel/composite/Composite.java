package com.kinnylee.designmodel.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class Composite implements IComponent {

    private Vector<IComponent> componentVector = new Vector<>();

    @Override
    public void simpleOperator() {
        Enumeration<IComponent> enumeration = components();
        while (enumeration.hasMoreElements()){
            enumeration.nextElement().simpleOperator();
        }
    }

    @Override
    public Composite getComposite() {
        return this;
    }

    public void add(IComponent component){
        componentVector.add(component);
    }

    public void remove(IComponent component){
        componentVector.remove(component);
    }

    public Enumeration<IComponent> components(){
        return componentVector.elements();
    }
}
