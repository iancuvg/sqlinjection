package com.SP.blog.sqlinjection.repository.jdbc;

import com.SP.blog.sqlinjection.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryJdbcUnSafe extends EmployeeRepositoryJdbc {

    @Override
    public List<Employee> filterByUsername(String name) {
        return jdbcTemplate.query("select * from employee where name ='" + name + "'", new EmployeeRowMapper());
    }


}
