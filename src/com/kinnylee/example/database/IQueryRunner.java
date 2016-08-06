package com.kinnylee.example.database;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by lijl-c on 2016/8/6.
 */
abstract public class IQueryRunner {

    public ResultSet run() throws Exception{
        Connection conn = createConnection();
        String sql = createSQL();
        return  runSQL(conn, sql);
    }

    protected abstract Connection createConnection();
    protected abstract String createSQL();
    protected abstract ResultSet runSQL(Connection conn, String sql) throws Exception;
}
