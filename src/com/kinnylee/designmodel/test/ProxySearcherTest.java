package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.proxy.ISearcher;
import com.kinnylee.designmodel.proxy.ProxySearcher;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class ProxySearcherTest {

    @Test
    public void testOK(){
        ISearcher searcher = new ProxySearcher();
        searcher.doSearch("admin", "admin");
    }

    @Test
    public void testError(){
        ISearcher searcher = new ProxySearcher();
        searcher.doSearch("user", "admin");
    }
}
