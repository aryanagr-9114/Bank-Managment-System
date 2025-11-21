package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/bank_db?useSSL=false&serverTimezone=UTC";
    private static final String User = "root";
    private static final String PASSWORD = "Aryan@9114";

    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(URL, User, PASSWORD);
    }
}