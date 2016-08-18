package com.kinnylee.example.test;

import com.kinnylee.example.order.*;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class OrderTest {

    @Test
    public void test(){
        Order order = new SalesOrder();
        OrderLine line1 = new OrderLine("apple", 11.1, 1);
        OrderLine line2 = new OrderLine("apple", 22.2, 2);
        order.addItem(line1);
        order.addItem(line2);

        Order newOrder = new HeaderDecorator(new FooterDecorator(order));
        newOrder.print();
    }
}
