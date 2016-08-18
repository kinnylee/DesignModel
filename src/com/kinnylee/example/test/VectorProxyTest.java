package com.kinnylee.example.test;

import com.kinnylee.example.vectorProxy.VectorProxy;
import org.junit.Test;

import java.util.List;
import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class VectorProxyTest {

    @Test
    public void test(){
        List<String> list = (List<String>) VectorProxy.factory(new Vector<String>(10));
        list.add("hello");
        list.add("world");
    }
}
