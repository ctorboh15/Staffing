package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.personnel;

/**
 * I moved most of the code to the Personnel Factory Class to keep the DAO light weight and easy to
 * understand.
 * 
 * @author cemah.tudae-torboh
 *
 */
public class PersonnelDAOImplementation
    implements PersonnelDAO {

    private DataSource datasource;

    private JdbcTemplate jdbcTemp;

    private PersonnelFactory pf;

    @Override
    public void setDataSource(DataSource ds) {

        this.datasource = ds;
        this.jdbcTemp = new JdbcTemplate(datasource);

    }

    @Override
    public void createPersonnel(personnel per, String type) {

        jdbcTemp.update(PersonnelFactory.getSQl(type), per.getFirstName(),
            per.getLastName(), per.getLogin(), per.getPassword());

    }

    @Override
    public personnel getPersonnel(Long id, String type) {

        try {
            return PersonnelFactory.getWorker(type, id, this.jdbcTemp);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        }

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<personnel> listAllPersonnel(String type) {

        try {
            return PersonnelFactory.listWorkers(type, this.jdbcTemp);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        }
        return null;
    }

    @Override
    public void delete(Long id, String type) {

        // TODO Auto-generated method stub

    }

    @Override
    public void update(personnel per, Long id, String type) {

        // TODO Auto-generated method stub

    }

}
