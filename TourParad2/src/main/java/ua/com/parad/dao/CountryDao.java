package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.Country;

public interface CountryDao extends JpaRepository <Country, Integer>{

}
