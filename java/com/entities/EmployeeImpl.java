package com.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
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
    
	@Column(name="isManager")
	private static boolean isManager;
	
   // public  String Type;
    
    
    public EmployeeImpl(String first, String last, String login, String pass){
    	this.firstName = first;
    	this.lastName = last;
    	this.login = login;
    	this.password = pass;
    	
    	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		EmployeeImpl.isManager = isManager;
	}

}
