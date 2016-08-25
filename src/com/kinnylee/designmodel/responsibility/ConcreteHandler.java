package com.kinnylee.designmodel.responsibility;

/**
 * Created by lijl-c on 2016/8/25.
 */
public class ConcreteHandler extends Handler{

    @Override
    public void handlerRequest() {
        if(getSuccessor() != null){
            System.out.println("The request is passed to：" + getSuccessor());
            getSuccessor().handlerRequest();
        }else{
            System.out.println("Thre request is passed here.");
        }
    }
}
