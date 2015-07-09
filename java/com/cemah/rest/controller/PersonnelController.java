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

import com.cemah.dao.PersonnelService;
import com.entities.personnel;

@RestController
@RequestMapping("/service/personnel")
public class PersonnelController {
	
	/**
	 * Used Spring for Dependency Injection for my personnel service.
	 */
 
   ApplicationContext context = new ClassPathXmlApplicationContext("Spring-All-Modules.xml");
    private PersonnelService personnelService = (PersonnelService)
     context.getBean("PersonnelService");
	
	    @RequestMapping(value = "/retrieve", method=RequestMethod.GET)
    public personnel getPersonnel(@RequestParam(value = "id") Long id, @RequestParam(value="type") String type) {
	    	
	      return personnelService.getPersonnel(id, type);
	    }
	    
	    


    @RequestMapping(value = "/get/list/{type}", method = RequestMethod.GET)
    public List<personnel> listAll(@PathVariable String type) {

       
        return personnelService.listAllPersonnel(type);

    }

	}

