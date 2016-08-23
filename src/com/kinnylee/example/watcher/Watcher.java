package com.kinnylee.example.watcher;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class Watcher implements Observer {

    public Watcher(Watched watched){
        watched.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data has been changed to: " + ((Watched)o).retirveData());
    }
}
