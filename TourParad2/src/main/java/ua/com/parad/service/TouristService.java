package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Tourist;

public interface TouristService {
	
	void create (Tourist tourist) throws Exception;
	List <Tourist> getAll();
	Tourist getOne (int id);
	void delete (int id);

}
