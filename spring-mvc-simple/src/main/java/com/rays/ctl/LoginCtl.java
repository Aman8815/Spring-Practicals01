package com.rays.ctl;

import javax.servlet.http.HttpSession;
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
import com.rays.form.loginForm;
import com.rays.service.UserServiceInt;

@Controller
@RequestMapping("/LoginCtl")
public class LoginCtl {
	@Autowired
	public UserServiceInt service;

	@GetMapping
	public String display(@ModelAttribute("form") loginForm form, @RequestParam(required = false) String operation,
			HttpSession session, Model model) {
		System.out.println("In diplay method login get");
		if (operation != null && operation.length() > 0) {
			session.invalidate();
			model.addAttribute("smsg", "User Logout Successfully");
			return "Login";
		}

		return "Login";
	}
    @PostMapping
	public String submit(@ModelAttribute("form") @Valid loginForm form,BindingResult result, @RequestParam(required = false) String operation,
			Model model, HttpSession session) {
         
		if (operation.equals("signUp")) {
			return "redirect:Register";
		}
		 if(result.hasErrors()) {
    		 return "Login";
    	 }
		UserDTO dto = null;
		try {
			dto = service.authonticate(form.getLogin(), form.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			model.addAttribute("emsg",e.getMessage());
		}

		if (dto != null) {
			session.setAttribute("user", dto);
			return "redirect:WelcomeCtl";
		}
		return "Login";

	}
}
