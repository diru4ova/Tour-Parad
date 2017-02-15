package ua.com.parad.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import ua.com.parad.dao.TourDao;
import ua.com.parad.dao.TouristDao;
import ua.com.parad.entity.Role;
import ua.com.parad.entity.Tour;
import ua.com.parad.entity.Tourist;
import ua.com.parad.service.TouristService;
//import ua.com.parad.validator.TouristValidator;
//import ua.com.parad.validator.Validator;

@Service("touristDetailsService")
public class TouristServiceImpl implements TouristService, UserDetailsService{
	
	@Autowired
	private TouristDao touristDao;
	@Autowired
	private TourDao tourDao;
	
	//@Autowired
	//@Qualifier("touristValidator")
	//private TouristValidator validator;
	
	@Autowired
    private BCryptPasswordEncoder encoder;
	

	public void create(Tourist tourist) throws Exception  {
		//validator.validate(tourist, result);
		
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

	@Transactional
    public void saveImage(Principal principal, MultipartFile multipartFile) {

        Tourist tourist = touristDao.findOne(Integer.parseInt(principal.getName()));

        String path = System.getProperty("catalina.home") + "/resources/"
                + tourist.getName() + "/" + multipartFile.getOriginalFilename();

        tourist.setPathImage("resources/" + tourist.getName() + "/" + multipartFile.getOriginalFilename());

        File file = new File(path);

        try {
            file.mkdirs();
            try {
                FileUtils.cleanDirectory
                        (new File(System.getProperty("catalina.home") + "/resources/" + tourist.getName() + "/"));
          } catch (IOException e) {
                e.printStackTrace();
            }
            multipartFile.transferTo(file);
        } catch (IOException e) {
            System.out.println("smth wrong with your file");
        }
    }

	public Tourist findByUuid(String uuid) {
		return touristDao.findByUuid(uuid);
	}

	public void update(Tourist tourist) {
		tourist.setPassword(encoder.encode(tourist.getPassword()));
		touristDao.save(tourist);
	}

	public Cookie intoBasket(int id, HttpServletRequest request, HttpServletResponse response) {
		
		request.getSession(false);
		Tour tour = tourDao.getOne(id);
		Cookie tourCookie = new Cookie(tour.getName(), String.valueOf(tour.getId()));
		
		tourCookie.setMaxAge(7*24*60*60);
		tourCookie.setHttpOnly(true);
		tourCookie.setPath("/");
		response.addCookie(tourCookie);
		System.out.println("Object: " + tourCookie + "; Name: " + tourCookie.getName() + "; Value: " + tourCookie.getValue());
		
		return tourCookie;
	}

	public List<Tour> showBasket(HttpServletRequest request) {
		
		request.getSession(false);
		List<Tour> tours = new ArrayList<Tour>();
		for(Cookie cookies : request.getCookies()){
			if(cookies.getName().equals("JSESSIONID")){
				
			}else{
				tours.add(tourDao.findOne(Integer.parseInt(cookies.getValue())));
			}
		}
		
		
		return tours;
	}
	
	

	
	
	

}
