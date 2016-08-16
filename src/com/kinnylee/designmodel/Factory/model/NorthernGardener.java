package com.kinnylee.designmodel.factory.model;

import com.kinnylee.designmodel.factory.intf.IFruit;
import com.kinnylee.designmodel.factory.intf.IGardener;
import com.kinnylee.designmodel.factory.intf.IVeggie;

/**
 * Created by 95 on 2016/8/8.
 */
public class NorthernGardener implements IGardener {

    @Override
    public IFruit createFruit() {
        return new NorthernFruit();
    }

    @Override
    public IVeggie createVeggie() {
        return new NorthernVeggie();
    }
}
