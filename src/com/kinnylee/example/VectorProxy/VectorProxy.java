package com.kinnylee.example.vectorProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class VectorProxy implements InvocationHandler{

    private Object proxyObject;

    public VectorProxy(Object obj){
        proxyObject = obj;
    }

    public static Object factory(Object obj){
        Class cls = obj.getClass();
        return cls.getClassLoader();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before calling: " + method);
        if(args != null){
            for(int i = 0; i < args.length; ++i){
                System.out.println(args[i] + "");
            }
        }

        Object o = method.invoke(proxyObject, args);
        System.out.println("after calling: " + method);
        return o;
    }
}
