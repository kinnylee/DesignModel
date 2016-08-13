package com.kinnylee.designmodel.abstra;

import com.kinnylee.designmodel.model.Product;

/**
 * Created by lijl-c on 2016/8/13.
 */
public abstract class Builder {

    public abstract void buildPart1();
    public abstract void buildPart2();

    public abstract Product retriveResult();
}
