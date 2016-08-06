package com.kinnylee.example.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class SysbaseQueryRunner extends IQueryRunner {
    @Override
    protected Connection createConnection() {
        return null;
    }

    @Override
    protected String createSQL() {
        return "SELECT * FROM users";
    }

    @Override
    protected ResultSet runSQL(Connection conn, String sql) throws Exception {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }
}
