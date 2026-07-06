package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementSelectExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/univ1";
        String username = "root";
        String password = "Aditya@2219";

        String query = "SELECT * FROM students";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("roll") + " " +
                                resultSet.getString("name") + " " +
                                resultSet.getString("city") + " " +
                                resultSet.getInt("dept_no")
                );
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
