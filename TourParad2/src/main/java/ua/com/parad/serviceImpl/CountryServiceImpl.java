package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.CountryDao;
import ua.com.parad.entity.Country;
import ua.com.parad.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryDao countryDao;

	public void create(Country country) {
		countryDao.save(country);
		
	}

	public List<Country> getAll() {
		
		return countryDao.findAll();
	}

	public Country getOne(int id) {
		
		return countryDao.findOne(id);
	}

	public void delete(int id) {
		countryDao.delete(id);
		
	}
	
	

}
