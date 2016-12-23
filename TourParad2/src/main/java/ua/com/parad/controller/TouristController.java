package ua.com.parad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.parad.entity.Tourist;
import ua.com.parad.service.TouristService;

@Controller
public class TouristController {
	
	private TouristService touristServise;
	
	@RequestMapping(value="/tourist", method=RequestMethod.GET)
	public String enterAsTourist(){
		return "tourist";
	}
	
	@RequestMapping(value="/newTourist", method=RequestMethod.POST)
	public String newTourist(@ModelAttribute Tourist tourist){
		
		touristServise.create(tourist);
		
		return "redirect:/successReg";
	} 
	
	/*@RequestMapping(value="/main", method=RequestMethod.POST)
	public String newTourist(@RequestParam String name, @RequestParam String surname,
			@RequestParam String email, @RequestParam int phone, 
			@RequestParam String facebook_account, @RequestParam String password){
		
		Tourist tourist = new Tourist(name, surname, email, phone, facebook_account, password);
		touristServise.create(tourist);
		return "touristProfile";
	}*/

}
