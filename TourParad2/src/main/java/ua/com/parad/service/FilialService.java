package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Filial;

public interface FilialService {
	
	void create (Filial filial);
	List <Filial> getAll();
	Filial getOne (int id);
	void delete (int id);

}
