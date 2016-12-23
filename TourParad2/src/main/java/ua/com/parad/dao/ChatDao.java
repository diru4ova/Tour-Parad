package ua.com.parad.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.parad.entity.Chat;

public interface ChatDao extends JpaRepository <Chat, Integer>{

}
