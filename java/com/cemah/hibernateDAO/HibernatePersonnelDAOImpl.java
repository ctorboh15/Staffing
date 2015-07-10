package com.cemah.hibernateDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.personnel;

public class HibernatePersonnelDAOImpl implements HibernatePersonnelDAO {

	  private SessionFactory sessionFactory;
	  
	  public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	  }
	@Override
	public void savePersonnel(personnel P) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(P);
        tx.commit();
        session.close();

	}

	@Override
	public List<personnel> listPerssonel() {
	  Session session = this.sessionFactory.openSession();
	 List<personnel>personnelList = session.createSQLQuery("select * from Employees").list(); 
	 session.close();
	return personnelList;
	  
	}

}
