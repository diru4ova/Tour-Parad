package ua.com.parad.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.com.parad.dao.TouristDao;
import ua.com.parad.entity.Tourist;

@Component ("touristValidator")
public class TouristValidator implements Validator{
	@Autowired
	private TouristDao touristDao;

	public void validate(Object object) throws Exception {
		
		Tourist tourist = (Tourist) object;
		if(tourist.getName().isEmpty()){
			throw new TouristValidationException(TouristValidationMessages.EMPTY_NAME_FIELD);
		}if(tourist.getSurname().isEmpty()){
			throw new TouristValidationException(TouristValidationMessages.EMPTY_SURNAME_FIELD);
		}if(tourist.getEmail().isEmpty()){
			throw new TouristValidationException(TouristValidationMessages.EMPTY_EMAIL_FIELD);
		}if(tourist.getPhone()==0){
			throw new TouristValidationException(TouristValidationMessages.EMPTY_PHONE_FIELD);
		}if(tourist.getPassword().isEmpty()){
			throw new TouristValidationException(TouristValidationMessages.EMPTY_PASSWORD_FIELD);
		}if(touristDao.findByEmail(tourist.getEmail())){
			throw new TouristValidationException(TouristValidationMessages.EMAIL_ALREADY_EXSISTS);
		}if(touristDao.findByPhone(tourist.getPhone())!=null){
			throw new TouristValidationException(TouristValidationMessages.PHONE_ALREADY_EXSISTS);	
		}if(!tourist.getEmail().contains("@")|| tourist.getEmail().contains(" ")){
			throw new TouristValidationException(TouristValidationMessages.INVALID_EMAIL);
		}if((tourist.getPassword().length())<6){
			throw new TouristValidationException(TouristValidationMessages.INVALID_PASSWORD);
		}
		
		
	}

	

}
