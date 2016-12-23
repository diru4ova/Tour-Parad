package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.Tourist;

public interface TouristDao extends JpaRepository <Tourist, Integer>{

}
