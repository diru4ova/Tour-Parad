package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.TouristDao;
import ua.com.parad.entity.Tourist;
import ua.com.parad.service.TouristService;

@Service
public class TouristServiceImpl implements TouristService{
	
	@Autowired
	private TouristDao touristDao;

	public void create(Tourist tourist) {
		touristDao.save(tourist);
		
	}

	public List<Tourist> getAll() {
		
		return touristDao.findAll();
	}

	public Tourist getOne(int id) {
		
		return touristDao.findOne(id);
	}

	public void delete(int id) {
		touristDao.delete(id);
		
	}
	
	

}
