package ua.com.parad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.parad.entity.Tourist;
import ua.com.parad.service.TouristService;

@Controller
public class TouristController {
	@Autowired
	private TouristService touristService;
	
	@RequestMapping(value="/tourist", method=RequestMethod.GET)
	public String enterAsTourist(){
		return "tourist";
	}
	
	
	@RequestMapping (value="/touristLogin", method=RequestMethod.GET)
	public String login(Model model){
		model.addAttribute("tourists", touristService.getAll());
		return "touristLogin";
		
	}
	
	@RequestMapping (value="/touristLogin", method=RequestMethod.POST)
	public String loginprocess(){
					
		return "touristProfile";
		
		
		
	}
	
	@RequestMapping (value="/touristRegistration", method=RequestMethod.GET)
	public String registration(Model model){
		model.addAttribute("tourist", new Tourist());
		return "touristRegistration";
		
	}
	
	//do not work
	@RequestMapping(value="/newTourist", method=RequestMethod.POST)
	public String newTourist(@ModelAttribute Tourist tourist){
		
		touristService.create(tourist);
		
		return "successReg";
	} 
	
	
	

}
