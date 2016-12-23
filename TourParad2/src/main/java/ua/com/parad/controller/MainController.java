package ua.com.parad.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController {
	
	@RequestMapping (value={"/","/main"}, method=RequestMethod.GET)
	public String main(){
		return "main";
		
	}
	
	@RequestMapping (value="/login", method=RequestMethod.GET)
	public String login(){
		return "login";
		
	}
	
	@RequestMapping (value="/login", method=RequestMethod.POST)
	public String loginprocess(){
		return "login";
		
	}
	
	@RequestMapping (value="/registration", method=RequestMethod.GET)
	public String registration(){
		return "registration";
		
	}

}
