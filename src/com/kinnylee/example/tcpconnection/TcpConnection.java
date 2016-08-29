package com.kinnylee.example.tcpconnection;

/**
 * Created by lijl-c on 2016/8/29.
 */
public class TcpConnection {

    private TcpState tcpState;

    public void setTcpState(TcpState tcpState){
        this.tcpState = tcpState;
    }

    public void open(){
        tcpState.open();
    }

    public void close(){
        tcpState.close();
    }

    public void acknowlege(){
        tcpState.acknowledge();
    }
}
