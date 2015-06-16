package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.personnel;


public class ContractorDAOimpl
    implements PersonnelDAO {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {

        this.dataSource = ds;
        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }

    @Override
    public void createPersonnel(String firstName, String lastName,
                                String Login, String pw) {

        String SQL =
            "Insert into contractors (firstName, lastName, login,password) values (?,?,?,?)";
        jdbcTemplate.update(SQL, firstName, lastName, Login, pw);

    }

    @Override
    public personnel getPersonnel(String login, String password) {

        String SQL = "Select * from contractors where login = ? AND password=?";

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
