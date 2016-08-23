package com.kinnylee.designmodel.template;

/**
 * Created by lijl-c on 2016/8/23.
 */
abstract public class AbstractClasss {

    public void templateMethod(){
        doOperator1();
        doOperator2();
        doOperator3();
    }

    abstract public void doOperator1();
    abstract public void doOperator2();

    final public void doOperator3(){
        System.out.println("Operator3....");
    }
}
