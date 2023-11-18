package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Role;

@Repository
public class HibernateRoleDao implements RoleDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final String Q_FIND_ROLE_BY_ROLENAME = "SELECT r FROM Role r WHERE r.name = :name";
	
	@Override
	public Role findRoleByRoleName(String roleName) {
		Session session = sessionFactory.getCurrentSession();
		try {
			return session.createQuery(Q_FIND_ROLE_BY_ROLENAME, Role.class)
					   .setParameter("name", roleName)
					   .getSingleResult();
		} catch (Exception e) {
			System.out.println("=====> No entity found for role name " + roleName);
			return null;
		}
	}
}
