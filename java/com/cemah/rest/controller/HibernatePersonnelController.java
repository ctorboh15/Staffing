package com.cemah.rest.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cemah.services.HibernatePersonnelService;
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
}
