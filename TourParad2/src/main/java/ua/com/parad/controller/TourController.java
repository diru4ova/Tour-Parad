package ua.com.parad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.parad.editor.CountryEditor;
import ua.com.parad.entity.Country;
import ua.com.parad.entity.Tour;
import ua.com.parad.service.CountryService;
import ua.com.parad.service.TourService;

@Controller
public class TourController {
	@Autowired
	private TourService tourService;
	
	@Autowired
	private CountryService countryService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
	}

	@RequestMapping(value="/allTours", method=RequestMethod.GET)
	public String allTours(Model model){
		model.addAttribute("tours", tourService.getAll());
		return "allTours";
	}
	
	@RequestMapping(value="/newTour", method=RequestMethod.GET)
	public String newTour(Model model){
		model.addAttribute("tour", new Tour());
		model.addAttribute("countries", countryService.getAll());
		return "newTour";
	}
	
	@RequestMapping(value="/newTour", method=RequestMethod.POST)
	public String createTour(@ModelAttribute Tour tour){
		tourService.create(tour);
		return "redirect:/agentProfile";
	}
	
	@RequestMapping(value="/tourDetails/{id}", method=RequestMethod.GET)
	public String newTour(@PathVariable int id, Model model){
		model.addAttribute("tour", tourService.getOne(id));
		return "tourDetails";
	}
	
	
}
