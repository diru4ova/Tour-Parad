package ua.com.parad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.parad.service.TourService;

@Controller
public class TourController {
	@Autowired
	private TourService tourService;

	@RequestMapping(value="/allTours", method=RequestMethod.GET)
	public String allTours(Model model){
		model.addAttribute("tours", tourService.getAll());
		return "allTours";
	}
	
	
}
