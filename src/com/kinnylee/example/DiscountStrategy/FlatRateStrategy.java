package com.kinnylee.example.DiscountStrategy;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class FlatRateStrategy extends DiscountStrategy {

    private int amount = 0;


    public FlatRateStrategy(float price, int numbers) {
        super(price, numbers);
    }

    @Override
    public float calculateDiscount() {
        return amount * super.getNumbers();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
