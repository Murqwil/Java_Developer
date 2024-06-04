package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Configuration configuration = new Configuration();
    private static SessionFactory sessionFactory;
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

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}