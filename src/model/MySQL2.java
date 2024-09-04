package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL2 {

    private static Connection connection;

    public static void createConnection() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopapp", "root", "password");

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeSearch(String query) {
        try {
            createConnection();
            return connection.createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Integer executeIUD(String query) {
        try {
            createConnection();
            return connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
