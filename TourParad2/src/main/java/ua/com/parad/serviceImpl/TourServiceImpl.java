package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.TourDao;
import ua.com.parad.entity.Tour;
import ua.com.parad.service.TourService;

@Service
public class TourServiceImpl implements TourService{
	@Autowired
	private TourDao tourDao;

	public void create(Tour tour) {
		tourDao.save(tour);
		
	}

	public List<Tour> getAll() {
		
		return tourDao.findAll();
	}

	public Tour getOne(int id) {
		
		return tourDao.findOne(id);
	}

	public void delete(int id) {
		tourDao.delete(id);
		
	}
	
	

}
