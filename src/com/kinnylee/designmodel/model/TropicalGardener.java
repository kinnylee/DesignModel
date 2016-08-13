package com.kinnylee.designmodel.model;

import com.kinnylee.designmodel.intf.IFruit;
import com.kinnylee.designmodel.intf.IGardener;
import com.kinnylee.designmodel.intf.IVeggie;

/**
 * Created by 95 on 2016/8/8.
 */
public class TropicalGardener implements IGardener {
    @Override
    public IFruit createFruit() {
        return new TropicalFruit();
    }

    @Override
    public IVeggie createVeggie() {
        return new TropicalVeggie();
    }
}
