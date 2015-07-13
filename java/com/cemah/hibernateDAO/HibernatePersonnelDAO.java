package com.cemah.hibernateDAO;

import java.util.List;

import com.entities.personnel;

public interface HibernatePersonnelDAO {
	public void savePersonnel(personnel P);
	public List<personnel> listPersonnel();
}
