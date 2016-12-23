package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.AgencyDao;
import ua.com.parad.entity.Agency;
import ua.com.parad.service.AgencyService;

@Service
public class AgencyServiceImpl implements AgencyService{
	
	@Autowired
	private AgencyDao agencyDao;

	public void create(Agency agency) {
	
		agencyDao.save(agency);
	}

	public List<Agency> getAll() {
		return agencyDao.findAll();
	}

	public Agency getOne(int id) {
		return agencyDao.findOne(id);
	}

	public void delete(int id) {
		agencyDao.delete(id);
		
	}

}
