package com.kinnylee.designmodel.bridge;

import java.awt.peer.ButtonPeer;

/**
 * Created by lijl-c on 2016/8/22.
 */
public class ConcreateImplemention1 extends Implementor {

    @Override
    public void operationImpl() {
        System.out.println("Doing something...");
    }
}
