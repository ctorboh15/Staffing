package com.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeImpl implements PersonnelInterface {
	

	@GeneratedValue
	@Id
	@Column(name="ID")
	protected Long id;

	@Column(name = "firstName")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    protected String firstName;
	
	@Column(name = "lastName")
    protected String lastName;

	@Column(name = "startDate")
    protected Date startDate;
	
	@Column(name = "endDate")
    protected Date endDate;
	
	@Column(name = "email")
    protected String email;

	@Column(name = "login")
    protected String login;

	@Column(name = "password")
    protected String password;
    
	
    protected String Type;
    
    
    public EmployeeImpl(String first, String last, String login, String email){
    	this.firstName = first;
    	this.lastName = last;
    	this.login = login;
    	this.email = email;
    	
    }
    
    public EmployeeImpl(){
    	
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

	@Override
	public boolean isManager() {
		return false;
	}

	@Override
	public boolean equals(Object obj) {
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

	
	

}
