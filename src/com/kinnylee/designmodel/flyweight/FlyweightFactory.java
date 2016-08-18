package com.kinnylee.designmodel.flyweight;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class FlyweightFactory {
    private Map<Character, Flyweight> files = new HashMap<>();

    private Flyweight lnkFlyweight;

    public FlyweightFactory(){

    }

    public Flyweight factory(Character state){
        if(files.containsKey(state)){
            return files.get(state);
        }else{
            Flyweight flyweight = new ConcreteFlyweight(state);
            files.put(state, flyweight);
            return flyweight;
        }
    }

    public void printFlyweight(){
        for(Iterator it = files.keySet().iterator(); it.hasNext();){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("item: " + e.getKey());
        }
    }
}
