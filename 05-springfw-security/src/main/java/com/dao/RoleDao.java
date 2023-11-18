package com.dao;

import com.entity.Role;

public interface RoleDao {
	Role findRoleByRoleName(String roleName);
}
