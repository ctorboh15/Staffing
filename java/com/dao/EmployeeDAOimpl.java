package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.personnel;


public class EmployeeDAOimpl
    implements PersonnelDAO {

    private DataSource datasource;

    private JdbcTemplate JdbcTemp;

    @Override
    public void setDataSource(DataSource ds) {

        this.datasource = ds;
        this.JdbcTemp = new JdbcTemplate(datasource);

    }

    @Override
    public void createPersonnel(String firstName, String lastName,
                                String Login, String pw) {

        // TODO Auto-generated method stub

    }

    @Override
    public personnel getPersonnel(String login, String password) {

        // TODO Auto-generated method stub

    }

    @Override
    public List<personnel> listAllPersonnel() {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {

        // TODO Auto-generated method stub

    }

    @Override
    public void update(Long id) {

        // TODO Auto-generated method stub

    }

}
