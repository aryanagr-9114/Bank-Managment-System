package database; // keep or change to whatever your original package is

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class DatabaseConnection {
    private static final String CONFIG_FILE = "config.properties";

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        try (InputStream in = new FileInputStream(CONFIG_FILE)) {
            props.load(in);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load " + CONFIG_FILE + ". Create it from config.properties.example", e);
        }

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String pass = props.getProperty("db.password");

        if (url == null || user == null) {
            throw new RuntimeException("Missing db.url or db.user in " + CONFIG_FILE);
        }

        return DriverManager.getConnection(url, user, pass);
    }
}
