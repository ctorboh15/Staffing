package com.entities;

import java.util.Date;
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

    public personnel(String first, String last, String login, String password) {

        this.login = login;
        this.password = password;
        this.firstName = first;
        this.lastName = last;
        this.startDate = setDate();
        this.endDate = setDate();
      
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

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getStartDate();

    public abstract String getEndDate();

    public abstract String getEmail();

    public abstract String getLogin();

    public abstract String getPassword();

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Date setDate(){
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	String dateInString = "07/06/2013";
 
	try {
 
		Date date = formatter.parse(dateInString);
		return date;
 
	} catch (ParseException e) {
		e.printStackTrace();
	}
	return null;
	}


}
