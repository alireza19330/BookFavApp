package com.developairs.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developairs.demo.model.Role;
import com.developairs.demo.repository.RoleRepository;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void saveRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public Role findByRoleName(String role) {
		return roleRepository.findByRole(role);
	}
}
