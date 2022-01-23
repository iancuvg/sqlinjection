package com.SP.blog.sqlinjection.repository.jdbc;

import com.SP.blog.sqlinjection.domain.Employee;
import com.SP.blog.sqlinjection.domain.Role;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("password"),
                Role.valueOf(rs.getString("role"))
        );
    }
}
