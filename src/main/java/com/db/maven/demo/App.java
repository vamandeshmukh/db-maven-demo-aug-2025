package com.db.maven.demo;

import com.db.maven.demo.model.Employee;
import com.db.maven.demo.service.EmployeeService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        List<Employee> employeeList = service.fetchAllEmployees();

        System.out.println("Employees data from the database:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

