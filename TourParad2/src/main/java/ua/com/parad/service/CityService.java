package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.City;


public interface CityService {
	
	void create (City city);
	List <City> getAll();
	City getOne (int id);
	void delete (int id);

}
