package com.jdbc.resultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ResultSetForwardExample {
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
                int roll = resultSet.getInt("roll");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                int department = resultSet.getInt("dept_no");
                System.out.println(
                        "Roll : " + roll +
                                ", Name : " + name +
                                ", City : " + city +
                                ", Department : " + department
                );
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}