package com.kinnylee.designmodel.client;

import com.kinnylee.designmodel.factory.SimpleFactory;
import com.kinnylee.designmodel.factory.intf.IFruit;

/**
 * Created by lijl-c on 2016/8/5.
 */
public class Main {
    public static void main(String[] args){
        IFruit fruit = SimpleFactory.createFruit("apple");
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
