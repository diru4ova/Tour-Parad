package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.com.parad.dao.OmanagerDao;
import ua.com.parad.entity.Omanager;
import ua.com.parad.service.OmanagerService;

@Service
public class OmanagerServiceImpl implements OmanagerService{
	
	private OmanagerDao omanagerDao;

	public void create(Omanager oManager) {
		omanagerDao.save(oManager);
		
	}

	public List<Omanager> getAll() {
		
		return omanagerDao.findAll();
	}

	public Omanager getOne(int id) {
		
		return omanagerDao.findOne(id);
	}

	public void delete(int id) {
		omanagerDao.delete(id);
		
	}
	
	

}
