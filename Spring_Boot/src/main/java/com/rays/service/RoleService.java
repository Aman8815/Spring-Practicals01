package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.DAO.RoleDAO;
import com.rays.DTO.RoleDTO;
@Service
public class RoleService {
	@Autowired
	public RoleDAO dao;
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(RoleDTO dto) {
		return dao.add(dto);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public long update(RoleDTO dto) {
		return dao.update(dto);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public long delete(RoleDTO dto) {
		return dao.delete(dto);
	}
	@Transactional(readOnly =false )
	public RoleDTO findByPk(RoleDTO dto) {
		return dao.findBYPk(dto);
		
	}

}
