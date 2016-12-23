package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Operator;

public interface OperatorService {
	
	void create (Operator operator);
	List <Operator> getAll();
	Operator getOne (int id);
	void delete (int id);

}
