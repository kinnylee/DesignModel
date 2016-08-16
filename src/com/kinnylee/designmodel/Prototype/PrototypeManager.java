package com.kinnylee.designmodel.prototype;

import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/16.
 */
public class PrototypeManager {

    private Vector<IPrototype> objects = new Vector<>();

    public void add(IPrototype object){
        objects.add(object);
    }

    public IPrototype get(int i){
        return objects.get(i);
    }

    public int size(){
        return objects.size();
    }
}
