package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.AmanagerDao;
import ua.com.parad.entity.Amanager;
import ua.com.parad.service.AmanagerService;

@Service
public class AmanagerServiceimpl implements AmanagerService{
	@Autowired
	private AmanagerDao amanagerDao;

	public void create(Amanager aManager) {
		amanagerDao.saveAndFlush(aManager);
		
	}

	public List<Amanager> getAll() {
		
		return amanagerDao.findAll();
	}

	public Amanager getOne(int id) {
		return amanagerDao.findOne(id);
	}

	public void delete(int id) {
		amanagerDao.delete(id);		
	}
	
	

}
