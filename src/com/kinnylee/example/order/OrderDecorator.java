package com.kinnylee.example.order;

/**
 * Created by lijl-c on 2016/8/17.
 */
abstract public class OrderDecorator extends Order{

    private Order order;

    public OrderDecorator(Order order){
        this.order = order;
        this.order.setCustomName(order.getCustomName());
        this.order.setSalesDate(order.getSalesDate());
    }

    public void print(){
        super.print();
    }
}
