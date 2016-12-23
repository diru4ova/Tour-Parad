package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.com.parad.dao.FilialDao;
import ua.com.parad.entity.Filial;
import ua.com.parad.service.FilialService;

@Service
public class FilialServiceImpl implements FilialService{
	
	private FilialDao filialDao;

	public void create(Filial filial) {
		filialDao.save(filial);
		
	}

	public List<Filial> getAll() {
		
		return filialDao.findAll();
	}

	public Filial getOne(int id) {
		
		return filialDao.findOne(id);
	}

	public void delete(int id) {
		filialDao.delete(id);
		
	}
	
	

}
