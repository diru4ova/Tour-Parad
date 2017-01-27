package ua.com.parad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.parad.entity.Country;
import ua.com.parad.service.CountryService;

@Controller
public class AdminController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping (value="/adminPage", method=RequestMethod.GET)
	public String adminPage (Model model){
		model.addAttribute("country", new Country());
		model.addAttribute("countries", countryService.getAll());
		return "adminPage";
		
	}
	
	@RequestMapping (value="/newCountry", method=RequestMethod.POST)
	public String newCountry (@ModelAttribute Country country){
		countryService.create(country);
		return "redirect:/adminPage";
		
	}

}
