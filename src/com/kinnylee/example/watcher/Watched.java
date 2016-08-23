package com.kinnylee.example.watcher;

import java.util.Observable;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class Watched extends Observable {

    private String data = "";

    public String retirveData(){
        return data;
    }

    public void changeData(String data){
        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }


}
