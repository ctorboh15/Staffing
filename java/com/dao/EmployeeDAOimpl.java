package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.contractor;
import com.entities.employee;
import com.entities.personnel;


public class EmployeeDAOimpl
    implements PersonnelDAO {

    private DataSource datasource;

    private JdbcTemplate jdbcTemp;

    @Override
    public void setDataSource(DataSource ds) {

        this.datasource = ds;
        this.jdbcTemp = new JdbcTemplate(datasource);

    }

    @Override
    public void createPersonnel(String firstName, String lastName,
                                String Login, String pw) {

        String SQL =
            "Insert into employees (firstName, lastName, login,password) values (?,?,?,?)";
        jdbcTemp.update(SQL, firstName, lastName, Login, pw);

    }

    @Override
    public personnel getPersonnel(Long id) {


        String SQL = "Select * from employees where ID = ?";
        personnel person =
            jdbcTemp.queryForObject(SQL, new Object[] {id},
                new PersonnelMapper(new contractor()));


        return person;

    }

    @Override
    public List<personnel> listAllPersonnel() {

        String SQL = "Select * from employees";
        List<personnel> contractorsList =
            jdbcTemp.query(SQL, new PersonnelMapper(new employee()));
        return contractorsList;
    }

    @Override
    public void delete(Long id) {

        String SQL = "Delete from employees where ID = ?";
        jdbcTemp.update(SQL, id);
    }

    @Override
    public void update(Long id) {

        String SQL = "Update from employees where ID = ?";
        jdbcTemp.update(SQL, id);

    }

}
