package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class employee extends personnel {

    private boolean isManager;


    @Id
    @GeneratedValue
    @Column(name = "ID")
    @Override
    public Long getId() {

        return this.id;

    }

    @Column(name = "firstName")
    @Override
    public String getFirstName() {

        // TODO Auto-generated method stub
        return null;
    }

    @Column(name = "lastName")
    @Override
    public String getLastName() {

        // TODO Auto-generated method stub
        return null;
    }

    @Column(name = "startDate")
    @Override
    public String getStartDate() {

        // TODO Auto-generated method stub
        return null;
    }

    @Column(name = "endDate")
    @Override
    public String getEndDate() {

        // TODO Auto-generated method stub
        return null;
    }

    @Column(name = "email")
    @Override
    public String getEmail() {

        // TODO Auto-generated method stub
        return null;
    }

    @Column(name = "login")
    @Override
    public String getLogin() {

        // TODO Auto-generated method stub
        return null;
    }

    @Column(name = "password")
    @Override
    public String getPassword() {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setMangerStatus() {

    }

}
