package com.kinnylee.designmodel.dm;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by lijl-c on 2016/8/13.
 */
public class RegSingleton {

    private static Map<String, RegSingleton> m_registry = new HashMap<>();

    static{
        RegSingleton singleton = new RegSingleton();
        m_registry.put(singleton.getClass().getCanonicalName(), singleton);
    }

    protected RegSingleton(){}

    public static RegSingleton getInstance(String name){
        if(name == null){
            name = "com.kinnylee.designmodel.dm.RegSingleton";
        }
        if(m_registry.get(name) == null){
            try {
                m_registry.put(name, (RegSingleton) Class.forName(name).newInstance());
            }catch (Exception e){
                System.out.println("error happened");
            }
        }
        return m_registry.get(name);
    }

    public String about(){
        return "Hello, I am RegSingleton!";
    }
}
