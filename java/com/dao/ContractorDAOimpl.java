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
    public personnel getPersonnel(Long id) {

        String SQL = "Select * from contractors where ID = ?";
        personnel person = jdbcTemplate.queryForObject(SQL, 
 new Object[] {id},
                new PersonnelMapper(new contractor()));
        
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

        String SQL = "Delete from contractors where ID = ?";
        jdbcTemplate.update(SQL, id);

    }

    @Override
    public void update(Long id) {

        String SQL = "Update from contractors where ID = ?";
        jdbcTemplate.update(SQL, id);

    }

}
