package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Agency;

public interface AgencyService {
	
	void create (Agency agency);
	List <Agency> getAll();
	Agency getOne (int id);
	void delete (int id);

}
