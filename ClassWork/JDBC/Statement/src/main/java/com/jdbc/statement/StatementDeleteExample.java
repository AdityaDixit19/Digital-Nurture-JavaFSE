package com.jdbc.statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class StatementDeleteExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/univ1";
        String username = "root";
        String password = "Aditya@2219";

        String query = "DELETE FROM students WHERE roll = 16";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);

                Statement statement = connection.createStatement()
        ) {

            int rowsAffected = statement.executeUpdate(query);

            System.out.println("Rows deleted: " + rowsAffected);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
