package com.dao;

import java.util.List;

import javax.sql.DataSource;

import com.entities.personnel;


public class ContractorDAOimpl
    implements PersonnelDAO {

    @Override
    public void setDataSource(DataSource ds) {

        // TODO Auto-generated method stub

    }

    @Override
    public void createPersonnel(String firstName, String lastName,
                                String Login, String pw) {

        // TODO Auto-generated method stub

    }

    @Override
    public void getPersonnel(String login) {

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
