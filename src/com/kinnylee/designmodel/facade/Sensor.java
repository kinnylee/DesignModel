package com.kinnylee.designmodel.facade;

/**
 * Created by lijl-c on 2016/8/22.
 */
public class Sensor {

    public void activate(){
        System.out.println("Activating the sensor...");
    }

    public void deactive(){
        System.out.println("Deactivating the sensor...");
    }

    public void trigger(){
        System.out.println("The sensor has been triggered...");
    }
}
