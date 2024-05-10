package jm.task.core.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // реализуйте алгоритм здесь
        Class.forName("com.mysql.cj.jdbc.Driver");
//Произвели коннект к нашей БД
        Util.getConnection();

//Создали объект класса чтобы могли тянуть методы с него
        UserDao userDao = new UserDaoJDBCImpl();
        UserService userService = new UserServiceImpl(userDao);

//Данный метод должен будет создать Таблицу Базы данных
        userService.createUsersTable();


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

/*
.idea убрать из репозитория

public class UserServiceImpl implements UserService { - заприватить поля + зависим всегда от интерфейсов, а не от реализаий +

throws SQ LException { - не пробрасывать исключения, обрабатывать на уровне ниже. +

сделать 1 Connection на класс,     public static Statement getStatement() - убери из Util. Statement создавать в каждом методе. но используя 1 Conntction +

createUsersTable - без использования resultSet, проверку делай по аналогии с удалением таблицы. +

 int rowsAffected  = это все убери, здесь не нужно. +

String query = " DELETE FROM `kata`.`user` WHERE ID = " + id; - запросы или в константы или сразу в параметры метода. удаление тоже через PreparedStatement +
 */