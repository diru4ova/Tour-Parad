package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Amanager;


public interface AmanagerService {
	
	void create (Amanager aManager);
	List <Amanager> getAll();
	Amanager getOne (int id);
	void delete (int id);

}
