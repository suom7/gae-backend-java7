package com.suom.backend.service;
import com.suom.backend.domain.Country;
import com.googlecode.objectify.ObjectifyService;
public class CountryServiceBean  {
	public CountryServiceBean(){
		ObjectifyService.register(Country.class);
	}
	
}
