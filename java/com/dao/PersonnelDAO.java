package com.dao;

import java.util.List;

import javax.sql.DataSource;

import com.entities.personnel;

public interface PersonnelDAO {

    public void setDataSource(DataSource ds);

    public void createPersonnel(String firstName, String lastName,
                                String Login, String pw);

    public personnel getPersonnel(String login, String Password);

    public List<personnel> listAllPersonnel();

    public void delete(Long id);

    public void update(Long id);
}
