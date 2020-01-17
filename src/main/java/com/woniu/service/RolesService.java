package com.woniu.service;

import java.util.List;
import java.util.Map;

import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;

public interface RolesService {
	void save(Roles r);
	void delete(Integer id);
	void update(Roles r);
	Roles findOne(Integer id);
	List<Roles> findAll();
	//获得某个角色已有权限集合
	List<Permissions> getPermissionsByRid(Integer id);
	//取消角色已有权限
  	void cancelPermissionsByRid(Integer rid);
  //批量授权
  	void insertBatch(Integer rid,Integer[] pids);
  	
  	
}
