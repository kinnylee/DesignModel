package com.kinnylee.designmodel.factory.intf;

import com.kinnylee.designmodel.simplefactory.IFruit;

/**
 * Created by 95 on 2016/8/8.
 */
public interface IGardener {
    IFruit createFruit();
    IVeggie createVeggie();
}
