package com.kinnylee.designmodel.test;

import com.kinnylee.designmodel.facade.SecurityFacade;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/22.
 */
public class FacadeTest {

    @Test
    public void test(){
        SecurityFacade facade = new SecurityFacade();
        facade.active();
        facade.deactive();
    }
}
