package com.rays.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.DTO.RoleDTO;
import com.rays.commen.BaseCtl;
import com.rays.commen.ORSResponse;
import com.rays.form.RoleForm;
import com.rays.service.RoleService;

@RestController
@RequestMapping(value = "role")
public class RoleCtl extends BaseCtl {
	@Autowired
	public RoleService service;

	@PostMapping("save")
	public ORSResponse save(@RequestBody @Valid RoleForm form, BindingResult result) {

		ORSResponse res = validate(result);

		if (!res.isSuccess()) {
			return res;
		}

		RoleDTO dto = (RoleDTO) form.getDto();

		long pk = service.add(dto);

		res.addData(pk);
		res.addMessage("DATA ADDED SUCCESSFULLY");

		return res;

	}
	@PostMapping("update")
	public ORSResponse update(@RequestBody @Valid RoleForm form, BindingResult result) {
		ORSResponse res = validate(result);
		
		if(!res.isSuccess()) {
			return res;
		}
		RoleDTO dto = (RoleDTO) form.getDto();
		long pk = service.update(dto);
		res.addData(pk);
		res.addMessage("DATA UPDATE SUCCESSFULLY");
		return res;
	}
	@PostMapping("delete")
	public ORSResponse delete(@RequestBody  RoleForm form) {
		
		ORSResponse res = new ORSResponse();
		System.out.println(form.getId());
		RoleDTO dto = (RoleDTO) form.getDto();
		if(dto!=null && dto.getId()!=null) {
			long pk =	service.delete(dto);
			res.addData(pk);
			res.addMessage("Data DELETE SUCCESSFULLY");
			res.setSuccess(true);
		}
		else {
		
		res.addMessage("Please Select Atleast One record");
		res.setSuccess(false);
		}
		
		return res;
		
	}
	@PostMapping("findpk")
	public ORSResponse findBypk(@RequestBody  RoleForm form) { 
		ORSResponse res = new ORSResponse();
		
		RoleDTO dto = (RoleDTO) form.getDto();
		
		if(dto!=null && dto.getId()!=null) {
			System.out.println(dto.getId());
			RoleDTO dto1 = service.findByPk(dto);
			
			if(dto1!=null&& dto1.getId()!=null) {
				res.addData(dto1);
				res.setSuccess(true);
			}else {
				res.addMessage("Not Record found");
			}
			
		}else {
			res.addMessage("Please Enter the one Id");
		}
		
		return res;
		
	}

}
