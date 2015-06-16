package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.contractor;
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
        personnel person = jdbcTemplate.queryForObject(SQL, 
                new Object[]{login,password}, new PersonnelMapper(new contractor()));
        
        return person;

    }

    @Override
    public List<personnel> listAllPersonnel() {

      String SQL = "Select * from contractors";
      List<personnel> contractorsList = jdbcTemplate.query(SQL, new PersonnelMapper(new contractor()));
        return contractorsList;
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
