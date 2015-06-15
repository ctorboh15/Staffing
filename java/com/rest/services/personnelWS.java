package com.rest.services;

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
    public personnel getPersonnel(@RequestParam(value = "name") String name) {
	       return new employee(name,"torboh","2/25/2015");
	    }
	    
	    


    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    public personnel[] listAll() {

        personnel[] perArr = new personnel[5];
        perArr[0] = new employee("Cemah", "torboh", "2/25/2015");
        perArr[1] = new employee("Joyce", "Tudae", "6/3/1995");
        return perArr;

    }

	}

