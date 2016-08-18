package com.kinnylee.example.order;

import java.util.Date;
import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/17.
 */
abstract public class Order {

    private String customName;
    private Date salesDate;
    private Vector<OrderLine> items = new Vector<>();

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public void addItem(OrderLine item){
        items.add(item);
    }

    public void removeItem(OrderLine item){
        items.remove(item);
    }

    public void print(){
        for (OrderLine orderLine : items) {
            orderLine.printLine();
        }
    }
}
