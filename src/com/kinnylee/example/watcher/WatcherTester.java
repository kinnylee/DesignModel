package com.kinnylee.example.watcher;

import java.awt.*;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class WatcherTester {

    static private Watcher watcher;
    static private Watched watched;

    public static void main(String[] args){
        watched = new Watched();
        watcher = new Watcher(watched);
        watched.changeData("abc");
        watched.changeData("aaa");
        watched.changeData("aaa");
        watched.changeData("ccc");
    }
}
