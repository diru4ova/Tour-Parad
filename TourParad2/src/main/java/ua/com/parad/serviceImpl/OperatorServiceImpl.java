package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.OperatorDao;
import ua.com.parad.entity.Operator;
import ua.com.parad.service.OperatorService;

@Service
public class OperatorServiceImpl implements OperatorService{
	@Autowired
	private OperatorDao operatorDao;

	public void create(Operator operator) {
		operatorDao.save(operator);
		
	}

	public List<Operator> getAll() {
		
		return operatorDao.findAll();
	}

	public Operator getOne(int id) {
		
		return operatorDao.findOne(id);
	}

	public void delete(int id) {
		operatorDao.delete(id);
		
	}
	
	

}
