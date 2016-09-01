package com.kinnylee.designmodel.client;

import com.kinnylee.designmodel.simplefactory.SimpleFactory;
import com.kinnylee.designmodel.simplefactory.IFruit;

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
