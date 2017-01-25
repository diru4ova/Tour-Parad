package ua.com.parad.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.parad.dao.TouristDao;
import ua.com.parad.entity.Tourist;

@Component ("touristValidator")
public class TouristValidator implements Validator{
	@Autowired
	private TouristDao touristDao;

	

	public boolean supports(Class<?> clazz) {
		
		return Tourist.class.isAssignableFrom(clazz);
	}

	public void validate(Object object, Errors errors) {
		Tourist tourist = (Tourist) object;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "name field should not be empty or consist of white spase");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.empty", "password field should not be empty");
	}

	/*public void validate(Object object) throws Exception {
		
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
		
		
	}*/

	

}
