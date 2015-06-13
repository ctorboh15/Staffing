package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Contractors")
public class contractor extends personnel {
	

    public contractor(String first, String last, String start) {

        super(first, last, start);
        // TODO Auto-generated constructor stub
    }
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
        return this.firstName;
    }

    @Column(name = "lastName")
    @Override
    public String getLastName() {

        // TODO Auto-generated method stub
        return this.lastName;
    }

    @Column(name = "startDate")
    @Override
    public String getStartDate() {

        // TODO Auto-generated method stub
        return this.startDate;
    }

    @Column(name = "endDate")
    @Override
    public String getEndDate() {

        // TODO Auto-generated method stub
        return this.endDate;
    }

    @Column(name = "email")
    @Override
    public String getEmail() {

        // TODO Auto-generated method stub
        return this.email;
    }

    @Column(name = "login")
    @Override
    public String getLogin() {

        // TODO Auto-generated method stub
        return this.login;
    }

    @Column(name = "password")
    @Override
    public String getPassword() {

        // TODO Auto-generated method stub
        return this.password;
    }
}
