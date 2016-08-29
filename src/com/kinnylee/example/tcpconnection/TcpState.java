package com.kinnylee.example.tcpconnection;

/**
 * Created by lijl-c on 2016/8/29.
 */
public interface TcpState {

    void open();
    void close();
    void acknowledge();
}
