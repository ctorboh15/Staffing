package com.cemah.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cemah.hibernateDAO.HibernatePersonnelDAOImpl;
import com.entities.Person;
import com.entities.PersonnelInterface;
import com.entities.personnel;

public class HibernatePersonnelService {

	private HibernatePersonnelDAOImpl hibernatePersonnelDAOImpl;

	public void setHibernatePersonnelDAOImpl(HibernatePersonnelDAOImpl hibernatePersonnelDAOImpl) {
		this.hibernatePersonnelDAOImpl = hibernatePersonnelDAOImpl;
	}

	public void createPersonnel(personnel Person) {

		hibernatePersonnelDAOImpl.savePersonnel(Person);
	}

	public List<personnel> listPersonnel() {
		return hibernatePersonnelDAOImpl.listPersonnel();
	}

	public personnel retrievePersonnel(Long id) {
		return hibernatePersonnelDAOImpl.retrievePersonnel(id);
	}

	public PersonnelInterface retrievePersonnelHib(Long id) {
		return hibernatePersonnelDAOImpl.retrievePersonnelHib(id);
	}

	public List<PersonnelInterface> listPersonnelHib() {
		return hibernatePersonnelDAOImpl.listPersonnelHib();
	}

	public boolean createPersonnelHib(PersonnelInterface person) {
		return hibernatePersonnelDAOImpl.createPersonnelHib(person);
	}

}
