package com.kinnylee.example.DiscountStrategy;

/**
 * Created by lijl-c on 2016/8/23.
 */
abstract public class DiscountStrategy {

    private float price = 0;
    private int numbers = 0;

    public DiscountStrategy(float price, int numbers){
        this.price = price;
        this.numbers = numbers;
    }

    abstract public float calculateDiscount();

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
