package com.jdbc.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionExample {

    public static void main(String[] args) {

        String url = "JDBC:mysql://localhost:3306/univ1";
        String username = "root";
        String password = "YOUR_PASSWORD";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully.");

            connection.close();

            System.out.println("Connection closed.");

        } catch (SQLException exception) {
            System.out.println("Connection failed.");
            exception.printStackTrace();
        }
    }
}