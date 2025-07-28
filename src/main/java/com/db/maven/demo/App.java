package com.db.maven.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/deutsche";
        String user = "postgres";
        String password = "root";
        String query = "SELECT * FROM employees";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("ID\tName\tSalary");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + "\t" + name + "\t" + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


//package com.db.maven.demo;
//
///**
// * @author Vaman Deshmukh
// */
//
//public class App {
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello World!");
//    }
//}
