package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.DTO.RoleDTO;
import com.rays.commen.BaseDTO;
import com.rays.commen.BaseForm;

public class RoleForm extends BaseForm {

	@NotEmpty(message = "name is required")
	public String name;

	@NotEmpty(message = "Descripation is required")
	public String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BaseDTO getDto() {
		RoleDTO dto = (RoleDTO) initDTO(new RoleDTO());
		dto.setName(name);
		dto.setDescription(description);
		return dto;
	}

}
