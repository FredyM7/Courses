package org.fmunera.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String url = "jdbc:mysql://localhost:3306/java_course?serverTimeZone=America/Bogota";
    private static String username = "root";
    private static String password = "famr";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
