package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.City;

public interface CityDao extends JpaRepository <City, Integer>{

}
