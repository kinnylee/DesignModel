package com.kinnylee.designmodel.proxy;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class AccessVaidator {

    public AccessVaidator(){

    }

    public boolean vaidateUser(String userId){
        if("admin".equals(userId)){
            return true;
        }
        return false;
    }
}
