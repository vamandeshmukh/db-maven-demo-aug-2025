package com.db.maven.demo.service;

import com.db.maven.demo.model.Employee;
import com.db.maven.demo.util.DbUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.sql.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceMockitoTest {

    private Connection mockConnection;
    private ResultSet mockResultSet;

    @BeforeEach
    void setup() throws SQLException {
        mockConnection = mock(Connection.class);
        PreparedStatement mockStatement = mock(PreparedStatement.class);
        mockResultSet = mock(ResultSet.class);

        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);
    }

    @Test
    void testFetchAllEmployeesWithMockedDb() throws SQLException {

        when(mockResultSet.next()).thenReturn(true, true, false);

        try (MockedStatic<DbUtil> dbUtilMockedStatic = mockStatic(DbUtil.class)) {
            dbUtilMockedStatic.when(DbUtil::getConnection).thenReturn(mockConnection);

            EmployeeService service = new EmployeeService();
            List<Employee> employees = service.fetchAllEmployees();

            assertEquals(2, employees.size() );

        }
    }
}
