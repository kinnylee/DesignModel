package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.proxy.ProxySubject;
import com.kinnylee.designmodel.proxy.Subject;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class ProxyTest {

    @Test
    public void test(){
        Subject subject = new ProxySubject();
        subject.request();
    }
}
