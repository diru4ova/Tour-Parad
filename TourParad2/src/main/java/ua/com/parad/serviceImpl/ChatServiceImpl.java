package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.com.parad.dao.ChatDao;
import ua.com.parad.entity.Chat;
import ua.com.parad.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{
	
	private ChatDao chatDao;

	public void create(Chat chat) {
		chatDao.save(chat);
		
	}

	public List<Chat> getAll() {
		
		return chatDao.findAll();
	}

	public Chat getOne(int id) {
		
		return chatDao.findOne(id);
	}

	public void delete(int id) {
		chatDao.delete(id);
		
	}
	
	

}
