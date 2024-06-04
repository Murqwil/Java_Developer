package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//Создали объект класса чтобы могли тянуть методы с него
        UserService userService = new UserServiceImpl();

        //Произвели коннект к нашей БД
        Util.getConnection();
        try (Session session = Util.getSessionFactory().openSession()) {
            //CRUD методы
            Transaction transaction = session.beginTransaction();

//Данный метод должен будет создать Таблицу Базы данных
            userService.createUsersTable();
        }

//Данный метод должен будет создать 4 юзера и занести их в нашу таблицу
            userService.saveUser("Name1", "LastName1", (byte) 20);
            userService.saveUser("Name2", "LastName2", (byte) 25);
            userService.saveUser("Name3", "LastName3", (byte) 31);
            userService.saveUser("Name4", "LastName4", (byte) 38);

//Данный метод должен вывести оставшихся юзеров из нашей таблицы
            userService.getAllUsers();

// Данный метод дожен будет удалить нашего юзера из таблицы
            userService.removeUserById(1);

//Данный метод должен очистить всю таблицу от наших юзеров
            userService.cleanUsersTable();

//Данный метод должен будет удалить нашу таблицу
            userService.dropUsersTable();
        }
    }

