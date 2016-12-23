package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.Agency;


public interface AgencyDao extends JpaRepository<Agency, Integer>{

}
