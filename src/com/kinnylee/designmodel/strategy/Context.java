package com.kinnylee.designmodel.strategy;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class Context {

    private Strategy strategy;

    public void contextInterface(){
        strategy.strategyInterface();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
