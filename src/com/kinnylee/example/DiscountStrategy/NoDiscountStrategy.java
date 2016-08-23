package com.kinnylee.example.DiscountStrategy;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class NoDiscountStrategy extends DiscountStrategy {

    public NoDiscountStrategy(float price, int numbers) {
        super(price, numbers);
    }

    @Override
    public float calculateDiscount() {
        return 0;
    }
}
