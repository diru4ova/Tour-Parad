package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Omanager;

public interface OmanagerService {
	
	void create (Omanager oManager);
	List <Omanager> getAll();
	Omanager getOne (int id);
	void delete (int id);

}
