package ua.com.parad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgencyController {
	
	@RequestMapping(value="/agent", method=RequestMethod.GET)
	public String enterAsAgent(){
		return "agent";
	}

}
