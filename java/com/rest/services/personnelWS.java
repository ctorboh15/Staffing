package com.rest.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entities.employee;
import com.entities.personnel;

@RestController
@RequestMapping("/service/personnel")
public class personnelWS {
	
	
	    @RequestMapping(value = "/get", method=RequestMethod.GET)
	    public personnel greeting(@RequestParam(value="name") String name) {
	       return new employee(name,"torboh","2/25/2015");
	    }
	    
	    
	    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	    public String getGreeting(@PathVariable String name) {
	     String result="Hello "+name;  
	     return result;
	    }
	}

