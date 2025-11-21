package com.rays.commen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class BaseCtl {
	
	public ORSResponse validate(BindingResult result) {
		
		ORSResponse res = new ORSResponse(true);
		
		if(result.hasErrors()) {
			
			 Map<String,String> errors = new HashMap<String,String>();
			res.setSuccess(false);
			
			List<FieldError> list = result.getFieldErrors();
			
			list.forEach(e -> {
				errors.put(e.getField(), e.getDefaultMessage());
			});
			
			res.addInputError(errors);
		}
		
		return res;
	}

}
