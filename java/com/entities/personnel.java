package com.entities;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class personnel
    implements Comparable<personnel> {

    protected Long id;

    protected String firstName;

    protected String lastName;

    protected Date startDate;

    protected Date endDate;

    protected String email;

    protected String login;

    protected String password;
    
    protected String Type;
    
    

    public personnel(String first, String last, String login, String password) {

        this.login = login;
        this.password = password;
        this.firstName = first;
        this.lastName = last;
        this.email = "***@email.com";
    }

    public personnel() {
		
	}
    
    

	@Override
    public int hashCode() throws NullPointerException {

        int hash = 8;
        hash = (int) (hash * id);
        return hash;
    }

    public boolean equals(Object obj) throws NullPointerException {

        if (obj == null) {
            return false;

        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        personnel per = (personnel) obj;

        if (this.id == null && per.id == null) {
            return false;
        } else if (this.id == null || per.id == null) {
            return false;

        }

        return this.id.equals(per.id);
    }

    @Override
    public int compareTo(personnel per) {

        int cmpt = this.lastName.compareToIgnoreCase(per.lastName);
        if (cmpt == 0) {
            cmpt = this.firstName.compareToIgnoreCase(per.firstName);
            if (cmpt == 0) {
                cmpt = this.id.compareTo(per.id);
            }
        }
        return cmpt;
    }

    public abstract Long getId();
    public abstract void setId(Long Id);

    public abstract String getFirstName();
    public abstract void setFirstName(String First);

    public abstract String getLastName();
    public abstract void setLastName(String Last);
    
    public abstract Date getStartDate();
    public abstract void setStartDate(Date date);

    public abstract Date getEndDate();
    public abstract void setEndDate(Date date);
    
    public abstract String getEmail();
    public abstract void setEmail(String Email);
    
    public abstract String getLogin();
    public abstract void setLogin(String Login);
    
    public abstract String getPassword();
    public abstract void setPassword(String Password);
    
}
