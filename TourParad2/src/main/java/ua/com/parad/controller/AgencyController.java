package ua.com.parad.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.parad.entity.Agency;
import ua.com.parad.entity.Chat;
import ua.com.parad.service.AgencyService;
import ua.com.parad.service.ChatService;
import ua.com.parad.service.TourService;

@Controller
public class AgencyController {
	@Autowired
	private AgencyService agencyServise;
	@Autowired
	private TourService tourservice;
	@Autowired
	private ChatService chatService;
	
	@RequestMapping(value="/agent", method=RequestMethod.GET)
	public String enterAsAgent(){
		return "agent";
		
		}
	
	@RequestMapping(value="/agentLogin", method=RequestMethod.GET)
	public String agentLogin(Model model){
		
		model.addAttribute("agents", agencyServise.getAll());
		
		return "agentLogin";
	}
	
	@RequestMapping(value="/agentLogin", method=RequestMethod.POST)
	public String agentLoginProcess(){
		return "agentProfile";
	}
	
	@RequestMapping(value="/agentRegistration", method=RequestMethod.GET)
	public String agentRegistration(Model model){
		model.addAttribute("agency", new Agency());
		return "agentRegistration";
	}
	
	@RequestMapping(value="/agentRegistration", method=RequestMethod.POST)
	public String agentRegProcess(@ModelAttribute Agency agency){
		agencyServise.create(agency);
		return "agentRegistration";
	}
	
	
	@RequestMapping(value="/agentProfile", method=RequestMethod.GET)
	public String agentProfile(Model model){
		model.addAttribute("chats", chatService.getAll());
		model.addAttribute("tours", tourservice.getAll());
		return "agentProfile";
	}
	
	
	@RequestMapping(value="/myAgency", method=RequestMethod.GET)
	public String myAgency(Model model, Principal principal){
		Agency agency = agencyServise.getOne(Integer.parseInt(principal.getName()));
		model.addAttribute("agency", agency);
		return "myAgency";
	}


}
