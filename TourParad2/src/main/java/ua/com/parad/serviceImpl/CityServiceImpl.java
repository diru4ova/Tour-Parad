package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.com.parad.dao.CityDao;
import ua.com.parad.entity.City;
import ua.com.parad.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	private CityDao cityDao;

	public void create(City city) {
		cityDao.save(city);
		
	}

	public List<City> getAll() {
		
		return cityDao.findAll();
	}

	public City getOne(int id) {
		
		return cityDao.findOne(id);
	}

	public void delete(int id) {
		cityDao.delete(id);
		
	}
	
	

}
