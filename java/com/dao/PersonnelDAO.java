package com.dao;

import java.util.List;

import javax.sql.DataSource;

import com.entities.personnel;

public interface PersonnelDAO {

    public void setDataSource(DataSource ds);

    public void createPersonnel(personnel per, String type);

    public personnel getPersonnel(Long id, String type);

    public List<personnel> listAllPersonnel(String type);

    public void delete(Long id, String type);

    public void update(personnel per, Long id, String type);
}
