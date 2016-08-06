package com.kinnylee.example.test;

import com.kinnylee.example.database.IQueryRunner;
import com.kinnylee.example.database.OracleQueryRunner;
import org.junit.Test;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class QueryRunnerTest {

    @Test
    public void testQueryRun() throws Exception{
        IQueryRunner queryRun = new OracleQueryRunner();
        queryRun.run();
    }
}
