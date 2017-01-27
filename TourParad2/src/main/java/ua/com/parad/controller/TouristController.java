package ua.com.parad.controller;

import java.security.Principal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.com.parad.dto.DtoUtilMapper;
import ua.com.parad.entity.Tourist;
import ua.com.parad.service.MailSenderService;
import ua.com.parad.service.TourService;
import ua.com.parad.service.TouristService;
import ua.com.parad.validator.TouristValidationMessages;
import ua.com.parad.validator.TouristValidator;

@Controller
public class TouristController {
	@Autowired
	private TouristService touristService;
	
	@Autowired
	private TouristValidator validator;
	
	@Autowired
	private MailSenderService mailSenderService;
	
	@Autowired
	private TourService tourService;
	
	@RequestMapping(value="/tourist", method=RequestMethod.GET)
	public String enterAsTourist(){
		return "tourist";
	}
	
	@RequestMapping(value="/tourist", method=RequestMethod.POST)
	public String enterAsTouristPost(){
		return "tourist";
	}
	
	
	@RequestMapping (value="/touristLogin", method=RequestMethod.GET)
	public String login(Model model){
		//model.addAttribute("tourists", DtoUtilMapper.touristsToTouristsDTO(touristService.getAll()));
		return "touristLogin";
		
	}
	
	@RequestMapping (value="/touristLogin", method=RequestMethod.POST)
	public String loginprocess(){
					
		return "redirect:/tourist";
		
		
		
	}
	
	@RequestMapping (value="/touristRegistration", method=RequestMethod.GET)
	public String registration(Model model){
		model.addAttribute("tourists", DtoUtilMapper.touristsToTouristsDTO(touristService.getAll()) );
		model.addAttribute("tourist", new Tourist());
		return "touristRegistration";
		
	}
	
	@RequestMapping(value="/newTourist", method=RequestMethod.POST)
	public String newTourist(@ModelAttribute Tourist tourist, Model model, BindingResult result) throws Exception{
		
		String uuid = UUID.randomUUID().toString();
		tourist.setUuid(uuid);
		
		validator.validate(tourist, result);
		if(result.hasErrors()){
			return "touristRegistration";
		}
		touristService.create(tourist);
		
		String theme = "registration confirmation";
		String text = "http://localhost:8080/TourParad2/confirm/" + uuid;
		mailSenderService.sendEmail(theme, text, tourist.getEmail());
		
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/confirm/{uuid}", method=RequestMethod.GET)
	public String confirm (@PathVariable String uuid){
		
		Tourist tourist = touristService.findByUuid(uuid);
		tourist.setEnabled(true);
		touristService.update(tourist);
		
		return "redirect:/";
	}
	
	/*@RequestMapping (value="/touristRegistration", method=RequestMethod.POST)
	public String tregistration(Model model){
		model.addAttribute("tourists", DtoUtilMapper.touristsToTouristsDTO(touristService.getAll()) );
		model.addAttribute("tourist", new Tourist());
		return "redirect:/touristLogin";
		
	}*/
	
	
	/*@RequestMapping(value="/newTourist", method=RequestMethod.POST)
	public String newTourist(@ModelAttribute Tourist tourist, Model model, BindingResult result) throws Exception{
		
		
		
		
		//touristService.create(tourist);
		
		
		try {
			touristService.create(tourist);
		} catch (Exception e) {
			
			if(e.getMessage().equals(TouristValidationMessages.EMPTY_NAME_FIELD)){
				model.addAttribute("usernameException", e.getMessage());
				System.out.println(tourist);
				
				return "touristRegistration";
			}
			
			else if(e.getMessage().equals(TouristValidationMessages.EMAIL_ALREADY_EXSISTS)||
					e.getMessage().equals(TouristValidationMessages.EMPTY_EMAIL_FIELD)){
				model.addAttribute("emailException", e.getMessage());
			}else if(e.getMessage().equals(TouristValidationMessages.INVALID_EMAIL)){
				model.addAttribute("invalidEmail", e.getMessage());
			}else if(e.getMessage().equals(TouristValidationMessages.EMPTY_PHONE_FIELD)){
				model.addAttribute("emptyPhone", e.getMessage());
			}else if(e.getMessage().equals(TouristValidationMessages.PHONE_ALREADY_EXSISTS)){
				model.addAttribute("phoneExists", e.getMessage());
			}else if(e.getMessage().equals(TouristValidationMessages.EMPTY_PASSWORD_FIELD)){
				model.addAttribute("emptyPassword", e.getMessage());		
			}else if(e.getMessage().equals(TouristValidationMessages.INVALID_PASSWORD)){
				model.addAttribute("invalidPassword", e.getMessage());		
			}
			
			System.out.println(tourist);
			
			return "touristRegistration";
		}
		
		
		return "redirect:/touristLogin";
		
	} 
	*/
	
	@RequestMapping(value="/saveImage", method=RequestMethod.POST)
	public String saveImage(Principal principal, @RequestParam MultipartFile image){
		
		touristService.saveImage(principal, image);
		
		return "redirect:/touristProfile";
	}
	

	@RequestMapping (value="/touristProfile", method=RequestMethod.POST)
	public String touristProfile(Model model){
		model.addAttribute("tourist", new Tourist());
		return "touristProfile";
		
	}
	
	@RequestMapping (value="/touristProfile", method=RequestMethod.GET)
	public String touristProfileGet(Principal principal, Model model){
		
		model.addAttribute("tourist", touristService.getOne(Integer.parseInt(principal.getName())));
		model.addAttribute("tours", tourService.getAll());
		return "touristProfile";
		
	}
	
	@RequestMapping (value="/updateProfile", method=RequestMethod.GET)
	public String updateProfile(Principal principal, Model model){
		
		model.addAttribute("tourist", touristService.getOne(Integer.parseInt(principal.getName())));
		
		return "updateProfile";
		
	}
	@RequestMapping (value="/updateProfile", method=RequestMethod.POST)
	public String update(Principal principal, @RequestParam String name,
			@RequestParam String password,
			@RequestParam String email){
		
		Tourist tourist =  touristService.getOne(Integer.parseInt(principal.getName()));
		tourist.setName(name);
		tourist.setPassword(password);
		tourist.setEmail(email);
		touristService.update(tourist);
		
		return "redirect:/touristProfile";
		
	}
	
	
	
	
	
	

}
