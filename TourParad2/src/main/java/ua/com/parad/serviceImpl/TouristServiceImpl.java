package ua.com.parad.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.parad.dao.TouristDao;
import ua.com.parad.entity.Role;
import ua.com.parad.entity.Tourist;
import ua.com.parad.service.TouristService;
import ua.com.parad.validator.Validator;

@Service("touristDetailsService")
public class TouristServiceImpl implements TouristService, UserDetailsService{
	
	@Autowired
	private TouristDao touristDao;
	@Autowired
	@Qualifier("touristValidator")
	private Validator validator;
	
	@Autowired
    private BCryptPasswordEncoder encoder;
	

	public void create(Tourist tourist) throws Exception {
		validator.validate(tourist);
		
		tourist.setRole(Role.ROLE_TOURIST);
		tourist.setPassword(encoder.encode(tourist.getPassword()));
		touristDao.save(tourist);
		
	}

	public List<Tourist> getAll() {
		
		return touristDao.findAll();
	}

	public Tourist getOne(int id) {
		
		return touristDao.findOne(id);
	}

	public void delete(int id) {
		touristDao.delete(id);
		
	}

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		return touristDao.findByName(name);
	}
	
	public Tourist findByName(String name) {
		return touristDao.findByName(name);
	}
	
	

}
