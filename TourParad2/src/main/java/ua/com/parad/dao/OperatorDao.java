package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.Operator;

public interface OperatorDao extends JpaRepository <Operator, Integer>{

}
