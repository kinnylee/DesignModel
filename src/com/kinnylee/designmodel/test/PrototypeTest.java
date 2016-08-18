package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.prototype.ConcreatePrototype;
import com.kinnylee.designmodel.prototype.IPrototype;
import com.kinnylee.designmodel.prototype.PrototypeManager;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/16.
 */
public class PrototypeTest {

    private IPrototype prototype;

    private PrototypeManager prototypeManager;

    @Test
    public void registerPrototype(){
        prototype = new ConcreatePrototype();
        IPrototype copyType = (IPrototype) prototype.clone();
        prototypeManager.add(copyType);
    }
}
