package com.kinnylee.designmodel.iterator;

/**
 * Created by lijl-c on 2016/8/24.
 */
public interface Iterator {

    void first();
    void next();
    boolean isDone();
    Object currentItem();
}
