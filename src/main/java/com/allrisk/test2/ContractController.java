package com.allrisk.test2;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ContractController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/contract/", method = RequestMethod.GET)
	public String home(Model model) {
		
		Date date = new Date();
				
		model.addAttribute("message", date );
		
		return "contract/list";
	}
	
	@RequestMapping(value = "/contract/test", method = RequestMethod.GET)
	public String test(Model model) {
		String sasek = "Pokusný string pøedaný do view Contract.";
		model.addAttribute("message",sasek);
		
		return "list";
	}
	
}