package com.holodex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionExample {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "dbuser";
        String password = "dbpassword";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connected to MySQL database!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

