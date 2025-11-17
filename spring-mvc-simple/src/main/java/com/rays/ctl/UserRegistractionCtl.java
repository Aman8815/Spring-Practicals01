package com.rays.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rays.dto.UserDTO;
import com.rays.form.UserRegistractionForm;
import com.rays.service.UserServiceInt;

@Controller
@RequestMapping(value="Register")
public class UserRegistractionCtl {
	@Autowired
	public UserServiceInt service; 
	
	@GetMapping
	public String display(@ModelAttribute("form") UserRegistractionForm form) {
		return  "UserRegistrationView";
	}
	
	@PostMapping
	public String submit(@ModelAttribute("form") @Valid UserRegistractionForm form ,BindingResult result,
			Model model,@RequestParam("operation") String operation) {
		if(operation.equals("reset")) {
			return "redirect:Register";
		}
		
		if(result.hasErrors()) {
			return "UserRegistrationView";
		}
		UserDTO dto = new UserDTO();
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());
		
		 
	 try {
		int pk =	(int) service.add(dto);
		model.addAttribute("smsg","Data Aaded successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		model.addAttribute("emsg",e.getMessage());
	}

		return "UserRegistrationView";
	}

}
