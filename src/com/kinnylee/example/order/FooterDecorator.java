package com.kinnylee.example.order;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class FooterDecorator extends OrderDecorator {

    public FooterDecorator(Order order) {
        super(order);
    }

    public void printFooter(){
        System.out.println("===========footer=========");
        System.out.println(getCustomName());
        System.out.println("===========footer=========");
    }
}
