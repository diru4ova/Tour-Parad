package ua.com.parad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OperatorController {
	
	@RequestMapping(value="/operator", method=RequestMethod.GET)
	public String enterAsOperator(){
		return "operator";
	}

}
