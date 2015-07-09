package com.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class employee extends personnel {

	private boolean managerStatus;

	public employee() {
		super();
	}

	public employee(String first, String last, String login, String pass) {

		super(first, last, login, pass);
		this.Type = "Employee";

	}

	@Id
	@GeneratedValue
	@Column(name = "ID")
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long Id) {
		this.id = Id;
	}

	@Column(name = "firstName")
	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String First) {
		this.firstName = First;
	}

	@Column(name = "lastName")
	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public void setLastName(String Last) {
		this.lastName = Last;
	}

	@Column(name = "startDate")
	@Override
	public Date getStartDate() {
		return this.startDate;
	}

	@Override
	public void setStartDate(Date date) {
		this.startDate = date;
	}

	@Column(name = "endDate")
	@Override
	public Date getEndDate() {
		return this.endDate;
	}

	@Override
	public void setEndDate(Date date) {

		this.endDate = date;
	}

	@Column(name = "email")
	@Override
	public String getEmail() {

		return this.email;
	}

	@Override
	public void setEmail(String email) {

		this.email = email;
	}

	@Column(name = "login")
	@Override
	public String getLogin() {

		return this.getLogin();
	}

	@Override
	public void setLogin(String Login) {
		this.login = Login;
	}

	@Column(name = "password")
	@Override
	public String getPassword() {

		return this.password;
	}

	@Override
	public void setPassword(String Password) {

		this.password = Password;
	}

	public boolean getmanagerStatus() {
		return this.managerStatus;
	}

	public void setmanagerStatus(boolean status) {
		this.managerStatus = status;
	}

}
