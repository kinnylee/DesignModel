package com.kinnylee.designmodel.proxy;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class UsageLogger {

    private String userId;

    public UsageLogger(){

    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void save(){
        System.out.println("saving...");
    }

    public void save(String userId){
        setUserId(userId);
        save();
    }
}
