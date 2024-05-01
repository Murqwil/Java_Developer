package jm.task.core.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // реализуйте алгоритм здесь
        Class.forName("com.mysql.cj.jdbc.Driver");
//Произвели коннект к нашей БД
        Util.getConnection();
        Util.getStatement();

//Создали объект класса чтобы могли тянуть методы с него
        UserDao userDao = new UserDaoJDBCImpl();

//Данный метод должен будет создать Таблицу Базы данных
        //userDao.createUsersTable();


//Данный метод должен будет создать 4 юзера и занести их в нашу таблицу
        //userDao.saveUser("Name1", "LastName1", (byte) 20);
        //userDao.saveUser("Name2", "LastName2", (byte) 25);
        //userDao.saveUser("Name3", "LastName3", (byte) 31);
        //userDao.saveUser("Name4", "LastName4", (byte) 38);

//Данный метод должен вывести оставшихся юзеров из нашей таблицы
        userDao.getAllUsers();

// Данный метод дожен будет удалить нашего юзера из таблицы
        //userDao.removeUserById(1);

//Данный метод должен очистить всю таблицу от наших юзеров
        //userDao.cleanUsersTable();

//Данный метод должен будет удалить нашу таблицу
        //userDao.dropUsersTable();

    }
}
