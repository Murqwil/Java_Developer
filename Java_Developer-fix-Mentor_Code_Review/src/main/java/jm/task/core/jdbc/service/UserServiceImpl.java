package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    //!Исправление: заприватить поля + зависим всегда от интерфейсов, а не от реализаций
    private final UserDao userDao = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        try {
            userDao.createUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка создания таблицы на уровне сервиса.");
        }
    }

    @Override
    public void dropUsersTable() {
        try {
            userDao.dropUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка удаления таблицы на уровне сервиса.");
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try {
            userDao.saveUser(name, lastName, age);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка сохранения пользователей на уровне сервиса.");
        }
    }

    @Override
    public void removeUserById(long id) {
        try {
            userDao.removeUserById(id);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка удаления пользователя по ID на уровне сервиса.");
        }
    }

    @Override
    public List<User> getAllUsers() {
        try {
            return userDao.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка вывода пользователей на уровне сервиса.");
        }
        return null;
    }

    @Override
    public void cleanUsersTable() {
        try {
            userDao.cleanUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка очитски всезх пользователей на уровне сервиса.");
        }
    }
}
