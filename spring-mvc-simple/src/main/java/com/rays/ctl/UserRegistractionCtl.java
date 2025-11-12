package com.rays.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String submit(@ModelAttribute("form") UserRegistractionForm form ,Model model) {
		
		UserDTO dto = new UserDTO();
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());
		
		 
	 int pk =	(int) service.add(dto);
	 model.addAttribute("smsg","Data Aaded successfully");
		return "UserRegistrationView";
	}

}
