package com.kinnylee.example.DiscountStrategy;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class PercentageStrategy extends DiscountStrategy {

    private float percentage;

    public PercentageStrategy(float price, int numbers) {
        super(price, numbers);
    }

    @Override
    public float calculateDiscount() {
        return percentage * getNumbers() * getPercentage();
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
