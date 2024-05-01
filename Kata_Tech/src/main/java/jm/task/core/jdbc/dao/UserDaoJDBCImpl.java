package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }


    public void createUsersTable() throws SQLException {
        //реализовать метод!!++
        // Проверяем, существует ли таблица 'user' в БД 'kata'
        ResultSet resultSet = Util.getStatement().executeQuery("SHOW TABLES FROM kata LIKE 'user'");
        if (resultSet.next()) {
            System.out.println("Таблица 'user' уже существует в базе данных 'kata'.");
        }
        // Создаем таблицу 'user' в БД 'kata'
        int rowsAffected = Util.getStatement().executeUpdate("CREATE TABLE kata.user (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "Name VARCHAR(50) NOT NULL," +
                "LastName VARCHAR(50) NOT NULL," +
                "Age INT NOT NULL" +
                ")");
        rowsAffected++;
        if (rowsAffected > 0) {
            System.out.println("Таблица 'user' успешно создана в базе данных 'kata'.");
        } else {
            System.out.println("Не удалось создать таблицу 'user' в базе данных 'kata'.");
        }
    }

    public void dropUsersTable() throws SQLException {
        //реализовать метод!!++
        int rowsAffected = Util.getStatement().executeUpdate("DROP TABLE IF EXISTS kata.user");
        if (rowsAffected <= 1) {
            System.out.println("Таблица 'user' успешно удалена из базы данных 'kata'.");
            rowsAffected--;
        } else {
            System.out.println("Не удалось удалить таблицу 'user' из базы данных 'kata'.");
        }
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        //реализовать метод!++
        PreparedStatement preparedStatement = Util.getConnection().prepareStatement(
                "INSERT INTO `kata`.`user` (`Name`, `LastName`, `Age`) VALUES (?, ?, ?)");

        preparedStatement.setString(1, name);
        preparedStatement.setString(2, lastName);
        preparedStatement.setByte(3, age);
        preparedStatement.executeUpdate();

        System.out.println("Пользователи успешно добавлены.");
    }

    public void removeUserById(long id) throws SQLException {
        //реализовать метод!!++
        String query = " DELETE FROM `kata`.`user` WHERE ID = " + id;
        Util.getStatement().executeUpdate(query);
        System.out.println("Пользовать с " + id + " был удален!");
    }


    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            resultSet = Util.getStatement().executeQuery("SELECT * FROM user;");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("Name");
                String lastName = resultSet.getString("LastName");
                byte age = resultSet.getByte("Age");
                User user = new User(id, name, lastName, age);
                users.add(user);
            }
        for (User user : users) {
            System.out.println(user);
        }
        return users;
        }



    public void cleanUsersTable() throws SQLException {
        //реализовать метод!!
        String cleanUsersTable = "DELETE FROM `kata`.`user`;";
        Util.getStatement().executeUpdate(cleanUsersTable);
        System.out.println("Произведена очистка таблицы!");
    }
}
