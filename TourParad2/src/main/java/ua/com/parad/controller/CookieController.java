package ua.com.parad.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.com.parad.service.TourService;
import ua.com.parad.service.TouristService;

public class CookieController {
	
	@Autowired
	private TourService tourService;
	@Autowired
	private TouristService touristService;
	
	
	/*@RequestMapping(value="/intoBasket/{id}", method=RequestMethod.GET)
	public String intoBasket(@PathVariable String id, HttpServletRequest request, HttpServletResponse response){
		
		touristService.intoBasket(Integer.parseInt(id), request, response);
				
		return "redirect:/";
	}*/
	
	/*@RequestMapping(value="/basket", method=RequestMethod.GET)
	public String showBasket(HttpServletRequest request, Model model){
		
		model.addAttribute("tours", touristService.showBasket(request));
		
				
	return "basket";
	}*/
	
	
	/*@RequestMapping(value="/intoBasket", method=RequestMethod.GET)
	public String intoBaskett(HttpServletRequest request, HttpServletResponse response){
		request.getSession();
		Cookie cookie = new Cookie ("cookie_name", "cookie_value");
		cookie.setMaxAge(360);
		cookie.setPath("/");
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
		
				
		return "redirect:/basket";
	}*/
	
	@RequestMapping(value="/basket", method=RequestMethod.GET)
	public String showBaskett(Model model){
		
		model.addAttribute("tours", tourService.getAll());
		
				
	return "basket";
	}
	
	
}
