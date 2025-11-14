package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rays.dto.UserDTO;
import com.rays.form.AddUserForm;
import com.rays.service.UserServiceInt;

@Controller
@RequestMapping("/AddUserCtl")
public class AddUserCtl {
	@Autowired
	public UserServiceInt service;

	@GetMapping
	public String display(@ModelAttribute("form") AddUserForm form, Model model,
			@RequestParam(required = false) String operation, Long id) {
           
		if (id != null && id > 0) {
			
			UserDTO dto = service.findByPk(id);
			form.setId(dto.getId());
			form.setFirstName(dto.getFirstName());
			form.setLastName(dto.getLastName());
			form.setLogin(dto.getLogin());
			form.setPassword(dto.getPassword());

		}

		return "Adduser";
	}

	@GetMapping("search")
	public String search(@ModelAttribute("form") AddUserForm form, Model model) {
		int pageNo = 1;
		int pageSize = 5;
		List list = service.search(null, pageNo, pageSize);
		form.setPageNo(pageNo);
		model.addAttribute("list", list);
		return "UserListView";
	}
	
	@PostMapping
	public String submit(@RequestParam(required = false) String operation,Model model,@ModelAttribute("form") AddUserForm form) {
		UserDTO dto = new UserDTO();
		dto.setId(form.getId());
	   dto.setFirstName(form.getFirstName());
	   dto.setLastName(form.getLastName());
	   dto.setLogin(form.getLogin());
	   dto.setPassword(form.getPassword());
		if(operation!=null&&operation.equals("Update")) {
			
			service.update(dto);
			model.addAttribute("msg","Data UPdate Successfully");
			
			return "Adduser";
		}
		if(operation!=null&&operation.equals("Save")) {
		   
			service.add(dto);
			model.addAttribute("msg","Data ADD Successfully");
			
			return "Adduser";
		}
		
		return "";
	}

}
