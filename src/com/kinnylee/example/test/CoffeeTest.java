package com.kinnylee.example.test;

import com.kinnylee.example.Coffee.FlavorFactory;
import com.kinnylee.example.Coffee.Order;
import com.kinnylee.example.Coffee.Table;
import org.junit.Test;

/**
 * Created by 95 on 2016/8/21.
 */
public class CoffeeTest {

    private static Order[] orders = new Order[10];
    private int orderMade = 0;
    private static FlavorFactory factory = new FlavorFactory();

    @Test
    public void test(){

        orders[orderMade++] = factory.getOrder("a");
        orders[orderMade++] = factory.getOrder("b");
        orders[orderMade++] = factory.getOrder("c");
        orders[orderMade++] = factory.getOrder("d");
        orders[orderMade++] = factory.getOrder("a");
        orders[orderMade++] = factory.getOrder("b");

        for(int i = 0; i < orderMade; ++i){
            orders[i].server(new Table(i));
        }

        System.out.println("total: " +  factory.getTotalFlavors());
    }
}
