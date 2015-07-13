package com.cemah.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cemah.hibernateDAO.HibernatePersonnelDAOImpl;
import com.entities.personnel;

public class HibernatePersonnelService {
	
	
	private HibernatePersonnelDAOImpl hibernatePersonnelDAOImpl;
	
	
	public void setHibernatePersonnelDAOImpl(HibernatePersonnelDAOImpl hibernatePersonnelDAOImpl){
		this.hibernatePersonnelDAOImpl = hibernatePersonnelDAOImpl;
	}
	
	public void createPersonnel(personnel Person) {
		
		hibernatePersonnelDAOImpl.savePersonnel(Person);
	}

	public List<personnel> listPersonnel() {
		return hibernatePersonnelDAOImpl.listPersonnel();
	}
}
