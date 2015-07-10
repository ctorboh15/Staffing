package com.cemah.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cemah.hibernateDAO.HibernatePersonnelDAOImpl;
import com.entities.personnel;

public class HibernatePersonnelService {
	
	
	private HibernatePersonnelDAOImpl HibDAO;
	
	@Autowired
	public void setHibernatePersonnelDAOImpl(HibernatePersonnelDAOImpl someDAO){
		this.HibDAO = someDAO;
	}
	public void createPersonnel(personnel Person) {
		HibDAO.savePersonnel(Person);
	}

	public List<personnel> listPersonnel() {
		return HibDAO.listPerssonel();
	}
}
