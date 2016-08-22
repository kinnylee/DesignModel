package com.kinnylee.designmodel.facade;

/**
 * Created by lijl-c on 2016/8/22.
 */
public class Alarm {

    public void active(){
        System.out.println("Activating the alarm...");
    }

    public void deactive(){
        System.out.println("Deactivating the alarm...");
    }

    public void ring(){
        System.out.println("Ringing the alarm");
    }

    public void stopRing(){
        System.out.println("Stop ring the arlam");
    }
}
