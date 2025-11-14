package com.rays.ctl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
			model.addAttribute("erormsg", "User Logout Successfully");
			return "Login";
		}

		return "Login";
	}
    @PostMapping
	public String submit(@ModelAttribute("form") loginForm form, @RequestParam(required = false) String operation,
			Model model, HttpSession session) {

		if (operation.equals("signUp")) {
			return "redirect:Register";
		}

		UserDTO dto = null;
		dto = service.authonticate(form.getLogin(), form.getPassword());

		if (dto != null) {
			session.setAttribute("user", dto);
			return "redirect:WelcomeCtl";
		}
		return "Login";

	}
}
