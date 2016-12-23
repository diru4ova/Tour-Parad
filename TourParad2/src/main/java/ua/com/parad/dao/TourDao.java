package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.Tour;

public interface TourDao extends JpaRepository <Tour, Integer>{

}
