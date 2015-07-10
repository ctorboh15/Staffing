package com.cemah.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cemah.services.HibernatePersonnelService;
import com.cemah.services.SpringJDBCPersonnelService;
import com.entities.personnel;

@RestController
@RequestMapping("/service/personnel")
public class PersonnelController {
	
	/**
	 * Used Spring for Dependency Injection for my personnel service.
	 */
 
   ApplicationContext context = new ClassPathXmlApplicationContext("Spring-All-Modules.xml");
    private SpringJDBCPersonnelService personnelService = (SpringJDBCPersonnelService)context.getBean("PersonnelService");
    private HibernatePersonnelService HibPersonnelService = (HibernatePersonnelService)context.getBean("HibernateService");
	
	    @RequestMapping(value = "/retrieve", method=RequestMethod.GET)
    public personnel getPersonnel(@RequestParam(value = "id") Long id, @RequestParam(value="type") String type) {
	    	
	      return personnelService.getPersonnel(id, type);
	    }
	    
	    @RequestMapping(value = "/hib", method = RequestMethod.GET)
	    public List<personnel> listAllHibernate() {

	       
	        return HibPersonnelService.listPersonnel();

	    }

    @RequestMapping(value = "/list/{type}", method = RequestMethod.GET)
    public List<personnel> listAll(@PathVariable String type) {

       
        return personnelService.listAllPersonnel(type);

    }

	}

