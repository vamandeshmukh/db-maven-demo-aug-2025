package com.db.maven.demo.service;

import com.db.maven.demo.model.Employee;
import com.db.maven.demo.util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public List<Employee> fetchAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employees";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary")
                );
                employees.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // You can replace with logger
        }

        return employees;
    }
}


