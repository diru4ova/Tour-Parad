package ua.com.parad.service;

import java.util.List;

import ua.com.parad.entity.Chat;

public interface ChatService {
	
	void create (Chat chat);
	List <Chat> getAll();
	Chat getOne (int id);
	void delete (int id);
	
	

}
