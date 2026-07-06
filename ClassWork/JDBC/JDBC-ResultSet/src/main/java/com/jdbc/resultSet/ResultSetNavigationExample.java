package com.jdbc.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNavigationExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/univ1";
        String username = "root";
        String password = "Aditya@2219";

        String query = "SELECT * FROM students";

        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                Statement statement =
                        connection.createStatement(
                                ResultSet.TYPE_SCROLL_INSENSITIVE,
                                ResultSet.CONCUR_READ_ONLY);

                ResultSet resultSet =
                        statement.executeQuery(query);
        ) {

            resultSet.first();
            System.out.println("First Student : " + resultSet.getString("name"));

            resultSet.last();
            System.out.println("Last Student : " + resultSet.getString("name"));

            resultSet.previous();
            System.out.println("Previous Student : " + resultSet.getString("name"));

            resultSet.absolute(5);
            System.out.println("5th Student : " + resultSet.getString("name"));

            resultSet.relative(2);
            System.out.println("2 Rows Forward : " + resultSet.getString("name"));

            resultSet.relative(-3);
            System.out.println("3 Rows Backward : " + resultSet.getString("name"));

            resultSet.beforeFirst();

            System.out.println("\nReading Again Using while Loop");

            while(resultSet.next()){
                System.out.println(resultSet.getInt("roll")
                        + " "
                        + resultSet.getString("name"));
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}