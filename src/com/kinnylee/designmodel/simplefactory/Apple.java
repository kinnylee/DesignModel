package com.kinnylee.designmodel.simplefactory;

/**
 * Created by lijl-c on 2016/8/5.
 */
public class Apple implements IFruit {

    private int treeAge;


    @Override
    public void grow() {
        System.out.println("Apple is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Apple is harvesting...");
    }

    @Override
    public void plant() {
        System.out.println("Apple is planting...");
    }

    public int getTreeAge(){
        return treeAge;
    }
}
