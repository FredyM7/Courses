package org.fmunera.java.jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String url = "jdbc:mysql://localhost:3306/java_course?serverTimeZone=America/Bogota";
    private static String username = "root";
    private static String password = "famr";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {

        if(pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);
            pool.setInitialSize(3);
            pool.setMaxTotal(8);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
        }

        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
