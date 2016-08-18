package com.kinnylee.example.order;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class HeaderDecorator extends OrderDecorator {

    public HeaderDecorator(Order order) {
        super(order);
    }

    public void printHeader(){
        System.out.println("**************header************");
        System.out.println(getSalesDate());
        System.out.println("**************header************");
    }

    public void print(){
        super.print();
        printHeader();
    }
}
