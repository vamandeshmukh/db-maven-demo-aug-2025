package com.db.maven.demo.service;

import com.db.maven.demo.model.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EmployeeServiceTest {

    private final EmployeeService service = new EmployeeService();

    @Test
    void testFetchAllEmployees() {
        List<Employee> empList = service.fetchAllEmployees();
        assertEquals(5 + 5, 10);
    }




}


//package com.db.maven.demo.service;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//class EmployeeServiceTest {
//
//    @Test
//    void testTest() {
//        int expected = 10;
//        int actual = 5 + 5;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testTest2() {
//        int expected = 10;
//        int actual = 5 + 6;
//        assertNotEquals(expected, actual);
//    }
//}
//
