package ua.com.parad.service;

import java.security.Principal;
import java.util.List;

//import org.springframework.validation.BindingResult;
//import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import ua.com.parad.entity.Tourist;

public interface TouristService {
	
	void create (Tourist tourist) throws Exception;
	List <Tourist> getAll();
	Tourist getOne (int id);
	void delete (int id);
	
	public void saveImage(Principal principal, MultipartFile multipartFile);

}
