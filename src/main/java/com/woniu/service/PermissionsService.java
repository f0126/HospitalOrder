package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;

public interface PermissionsService {
	void save(Permissions p);
	void delete(Integer id);
	void update(Permissions p);
	List<Permissions> findAll();
	Permissions findOne(Integer id);
	
	//按照树形结构获得权限集合
	List<Permissions> findPermissionByTree();
	//将有层次的集合转换为平级
	List<Permissions> transformTree2Oneview(List<Permissions> treeList);
}
