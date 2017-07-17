package com.suom.backend.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suom.backend.domain.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping ("countries")

public class CountryController {
	
	   private final Logger LOG = LoggerFactory.getLogger(CountryController.class);
	
		@RequestMapping(value = "home", method = RequestMethod.GET )
		@ResponseBody
	    public ResponseEntity<Country> homePage() {
			LOG.info("=================Create Sample Country=====================");
			Country c = new Country();
			c.setName("Cambodia");
			c.setCode("+855");
			c.setCurrency("Riel");
			return new ResponseEntity<Country>(c, HttpStatus.OK);
	    }

}
