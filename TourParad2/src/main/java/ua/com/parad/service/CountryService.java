package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Country;


public interface CountryService {
	
	void create (Country country);
	List <Country> getAll();
	Country getOne (int id);
	void delete (int id);

}
