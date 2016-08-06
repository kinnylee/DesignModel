package com.kinnylee.example.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by lijl-c on 2016/8/6.
 */
public class OracleQueryRunner extends IQueryRunner {
    @Override
    protected Connection createConnection() {
        System.out.println("createConnection success...");
        return null;
    }

    @Override
    protected String createSQL() {
        System.out.println("createSQL success....");
        return "SELECT * FROM users";
    }

    @Override
    protected ResultSet runSQL(Connection conn, String sql) throws Exception {
        System.out.println("run sql success...");
        //Statement stmt = conn.createStatement();
        //return stmt.executeQuery(sql);
        return null;
    }
}
