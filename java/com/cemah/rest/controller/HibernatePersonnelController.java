package com.cemah.rest.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cemah.services.HibernatePersonnelService;
import com.entities.EmployeeImpl;
import com.entities.Person;
import com.entities.PersonnelInterface;
import com.entities.employee;
import com.entities.personnel;

@RestController
@RequestMapping("/hib")
public class HibernatePersonnelController {
	   ApplicationContext context = new ClassPathXmlApplicationContext("Spring-All-Modules.xml");
	  private HibernatePersonnelService HibPersonnelService = (HibernatePersonnelService)context.getBean("HibernateService");

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<personnel> listAllHibernate() {

       
        return HibPersonnelService.listPersonnel();

    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPersonnel(@RequestParam("first") String first, @RequestParam("last") String last,
    									@RequestParam("login") String login,@RequestParam("pass") String pass){
    	try{
    	HibPersonnelService.createPersonnel(new employee(first,last,login,pass));
    	
    	return "Personnel Added Successfully";
    	}catch(Exception e){
    		e.getMessage();
    	}
    	
    	return "There was an error";
    }
    
    
    @RequestMapping(value= "/retrieve" , method = RequestMethod.GET)
    public personnel retrievePersonnel(@RequestParam("ID") Long id){
    	try{
    	personnel person = HibPersonnelService.retrievePersonnel(id);
    	return person;
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    	
    	return null;
    }
    

	@RequestMapping(value = "/listHib", method = RequestMethod.GET)
    public List<PersonnelInterface> listAllHib() {
       
        return HibPersonnelService.listPersonnelHib();
    }
    
    @RequestMapping(value="/retrieveHib" , method= RequestMethod.GET)
    public PersonnelInterface retrievePersonnelHib(@RequestParam("ID") Long id){
    	try {
    		PersonnelInterface person = HibPersonnelService.retrievePersonnelHib(id);
    		return person;
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    	return null;
    }
    
    @RequestMapping(value="/createHib", method= RequestMethod.POST)
    public String createPersonnelHib(@RequestParam("first") String first, @RequestParam("last") String last,
			@RequestParam("login") String login,@RequestParam("pass") String pass){
    	try{
        	HibPersonnelService.createPersonnelHib(new EmployeeImpl(first,last,login,pass));
        	
        	return "Personnel Added Successfully";
        	}catch(Exception e){
        		e.getMessage();
        	}
        	
        	return "There was an error";
    }
    
    
    
    
    	
}
