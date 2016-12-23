package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Tour;

public interface TourService {
	
	void create (Tour tour);
	List <Tour> getAll();
	Tour getOne (int id);
	void delete (int id);

}
