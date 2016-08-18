package com.kinnylee.example.order;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class OrderLine {
    private String name;
    private double price;
    private int number;

    public OrderLine(){

    }

    public OrderLine(String name, double price, int number){
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printLine(){
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("number: " + number);
    }
}
