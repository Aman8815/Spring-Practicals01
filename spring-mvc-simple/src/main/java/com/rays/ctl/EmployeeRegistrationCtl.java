package com.rays.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rays.dto.EmployeeDTO;
import com.rays.form.UserRegistractionForm;
import com.rays.service.EmployeeServiceInt;

@Controller
@RequestMapping(value="Employee")
public class EmployeeRegistrationCtl {
	 @Autowired
	 public EmployeeServiceInt service;
	@GetMapping
	public String display(@ModelAttribute("form") UserRegistractionForm form) {
		
		return "EmployeeREgistration";
	}
	@PostMapping
	public String submit(@ModelAttribute("form") UserRegistractionForm form , Model model) {
		 EmployeeDTO dto = new EmployeeDTO();
		 dto.setFirstName(form.getFirstName());
		 dto.setLastName(form.getLastName());
		 dto.setLogin(form.getLogin());
		 dto.setAddress(form.getAddress());
		 dto.setSalary(form.getSalary());
		 
		int pk =  (int) service.add(dto);
		
		model.addAttribute("smsg","Data Add Succfully");
		
		return "EmployeeREgistration";
	}

}
