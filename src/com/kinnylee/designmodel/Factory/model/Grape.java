package com.kinnylee.designmodel.factory.model;

import com.kinnylee.designmodel.factory.intf.IFruit;

/**
 * Created by lijl-c on 2016/8/5.
 */
public class Grape implements IFruit {

    private boolean sendless;

    @Override
    public void grow() {

    }

    @Override
    public void harvest() {

    }

    @Override
    public void plant() {

    }

    public boolean isSendless() {
        return sendless;
    }
}
