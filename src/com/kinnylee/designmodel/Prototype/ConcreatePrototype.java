package com.kinnylee.designmodel.prototype;

/**
 * Created by lijl-c on 2016/8/16.
 */
public class ConcreatePrototype implements IPrototype{

    public synchronized Object clone(){

        IPrototype temp = null;

        try {
            temp = (IPrototype) super.clone();
            return temp;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return temp;
        }
    }
}
