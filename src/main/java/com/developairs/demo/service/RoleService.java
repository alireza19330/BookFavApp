package com.developairs.demo.service;

import com.developairs.demo.model.Role;

public interface RoleService {
	public void saveRole(Role role);
	public Role findByRoleName(String role);
}
