package com.cemah.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cemah.dao.PersonnelService;
import com.entities.personnel;

@RestController
@RequestMapping("/service/personnel")
public class personnelWS {
	
	/**
	 * Used Spring for Dependency Injection for my personnel serivce.
	 */
    @Autowired
    private PersonnelService personnelService;

    // ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    // private PersonnelService personnelService = (PersonnelService)
    // context.getBean("PersonnelService");
	
	    @RequestMapping(value = "/retrieve", method=RequestMethod.GET)
    public personnel getPersonnel(@RequestParam(value = "id") Long id, @RequestParam(value="type") String type) {
	    	
	      return personnelService.getPersonnel(id, type);
	    }
	    
	    


    @RequestMapping(value = "/get/list/{type}", method = RequestMethod.GET)
    public List<personnel> listAll(@PathVariable String type) {

       
        return personnelService.listAllPersonnel(type);

    }

	}

