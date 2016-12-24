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
	
	

	@RequestMapping (value="/enterToStart", method=RequestMethod.GET)
	public String enterToStart(){
		
		return "enterToStart";
		
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public String logout(){
		return "redirect:/";
	}
}
