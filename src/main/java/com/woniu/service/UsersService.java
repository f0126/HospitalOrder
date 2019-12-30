package com.woniu.service;

import java.util.List;
import java.util.Map;

import com.woniu.domain.Roles;
import com.woniu.domain.Users;

public interface UsersService {
	void save(Users u);
	void delete(Integer id);
	void update(Users u);
	Users findOne(Integer id);
	List<Users> findAll();
	//根据用户查所拥有的角色
	List<Roles> getRolesByUid(Integer id);
	//批量分配角色
	void insertBatch(Integer uid,Integer[] rids);
	//取消现有的角色
	void cancelHasedRoles(Integer uid);
}
