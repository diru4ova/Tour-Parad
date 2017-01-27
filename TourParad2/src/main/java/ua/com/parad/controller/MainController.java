package ua.com.parad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.parad.editor.TourEditor;
import ua.com.parad.entity.Tour;
import ua.com.parad.service.TourService;





@Controller
public class MainController {
	
	@Autowired
	private TourService tourService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Tour.class, new TourEditor(tourService));
	}
	
	
	
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
