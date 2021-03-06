package com.cemah.hibernateDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.EmployeeImpl;
import com.entities.Person;
import com.entities.PersonnelInterface;
import com.entities.contractor;
import com.entities.employee;
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
	public List<personnel> listPersonnel() {
	  Session session = this.sessionFactory.openSession();
	 List<personnel>personnelList = session.createSQLQuery("select * from Employees").list(); 
	 session.close();
	return personnelList;
	  
	}
	
	
	@Override
	public personnel retrievePersonnel(Long id) {
		Session session = this.sessionFactory.openSession();
		personnel person = (personnel) session.createSQLQuery("Select * from Employee where ID = :id").setParameter("id", id);
		session.close();
		return person;
	}
	
	
	
	public PersonnelInterface retrievePersonnelHib(Long id){
		Session session = this.sessionFactory.openSession();
		PersonnelInterface person = (PersonnelInterface) session.get(EmployeeImpl.class, id);
		session.close();
		return person;
	}
	
	public List<PersonnelInterface> listPersonnelHib(){
		Session session = this.sessionFactory.openSession();
		List <PersonnelInterface> personList = session.createSQLQuery("select * from Employees").list(); 
		session.close();
		return personList;
	}
	
	@SuppressWarnings("finally")
	public boolean createPersonnelHib(PersonnelInterface personnel){
		boolean created = false;
		try{
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(personnel);
		tx.commit();
		session.close();
		created = true;
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			return created;
		}
		
	}
	
	
	

}
