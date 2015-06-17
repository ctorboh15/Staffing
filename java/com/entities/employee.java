package com.entities;



// @Entity
// @Table(name = "Employee")
public class employee
    extends personnel {

    private boolean isManager;

    public employee() {

    }

    public employee(String first, String last, String login, String pass) {

        super(first, last, login,pass);

    }

    // @Id
    // @GeneratedValue
    // @Column(name = "ID")
    @Override
    public Long getId() {

        return this.id;

    }

    // @Column(name = "firstName")
    @Override
    public String getFirstName() {

        // TODO Auto-generated method stub
        return this.firstName;
    }

    // @Column(name = "lastName")
    @Override
    public String getLastName() {

        // TODO Auto-generated method stub
        return this.lastName;
    }

    // @Column(name = "startDate")
    @Override
    public String getStartDate() {

        // TODO Auto-generated method stub
        return this.startDate.toString();
    }

    // @Column(name = "endDate")
    @Override
    public String getEndDate() {

        // TODO Auto-generated method stub
        return this.endDate.toString();
    }

    // @Column(name = "email")
    @Override
    public String getEmail() {

        // TODO Auto-generated method stub
        return this.email;
    }

    // @Column(name = "login")
    @Override
    public String getLogin() {

        // TODO Auto-generated method stub
        return this.login;
    }

    // @Column(name = "password")
    @Override
    public String getPassword() {

        // TODO Auto-generated method stub
        return this.password;
    }

    // @Column(name = "isManager")
    public void setMangerStatus() {

        isManager = true;
    }

    public boolean getManagerStatus() {

        return isManager;

    }

}
