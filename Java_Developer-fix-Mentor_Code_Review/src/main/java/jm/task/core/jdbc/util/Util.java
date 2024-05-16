package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static Connection connection;
    private Util() {
    }
    // реализуйте настройку соеденения с БД
        public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}


