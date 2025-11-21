package com.rays.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.rays.DTO.RoleDTO;
@Repository
public class RoleDAO {
	@PersistenceContext
	public EntityManager entity;
	
	public long add(RoleDTO dto) {
		
		 entity.persist(dto);
		 return dto.getId();
	}
	
	public long update(RoleDTO dto) {
		
		entity.merge(dto);
		return dto.getId();
	}
   public long delete(RoleDTO dto) {
	   
	 RoleDTO role =  entity.find(RoleDTO.class,dto.getId());
	   
	   entity.remove(role);
	 return dto.getId()  ;
   }
   
   public RoleDTO findBYPk(RoleDTO dto) {
	   
	 RoleDTO   dto1 = entity.find(RoleDTO.class, dto.getId());
	   return dto1;
   }
}
