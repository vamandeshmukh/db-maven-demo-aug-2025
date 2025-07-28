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

        your logic

        return employees;
    }
}


