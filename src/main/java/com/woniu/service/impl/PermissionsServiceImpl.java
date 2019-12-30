package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PermissionsMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.PermissionsExample;
import com.woniu.service.PermissionsService;

@Service
@Transactional
public class PermissionsServiceImpl implements PermissionsService{

	@Autowired
	PermissionsMapper mapper;
	
	@Override
	public void save(Permissions p) {
		mapper.insertSelective(p);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Permissions p) {
		mapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public List<Permissions> findAll() {
		PermissionsExample example=new PermissionsExample();
		example.or().andPidNotEqualTo(-1);
		return mapper.selectByExample(example);
	}

	@Override
	public Permissions findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	//得到带层次的权限集合
	@Override
	public List<Permissions> findPermissionByTree() {
		List<Permissions> allPermissionsList=findAll();
		List<Permissions> treePermissionsList=new ArrayList<Permissions>();
		for (Permissions p : allPermissionsList) {
			if(p.getParentid()==0) {
				treePermissionsList.add(p);
			}
		}
		for (Permissions p : treePermissionsList) {
			p.setChildren(getChildren(p.getPid(),allPermissionsList));
		}
		//为子权限加前缀
		addPrefix4ChildrenPremissions(treePermissionsList);
		return treePermissionsList;
	}
	//为子权限加前缀的方法
	private void addPrefix4ChildrenPremissions(List<Permissions> treePermissionsList) {
		for (Permissions p : treePermissionsList) {
			addPrefix(p.getChildren(),"　　");
		}
	}
	//通过递归算法为权限加前缀
	private void addPrefix(List<Permissions> children, String prefix) {
		for (Permissions c : children) {
			c.setPname(prefix+c.getPname());
			if(c.getChildren()!=null) {
				addPrefix(c.getChildren(), prefix+"　　");
			}
		}
	}

	private List<Permissions> getChildren(Integer pid, List<Permissions> allPermissionsList) {
		List<Permissions> childrenList=new ArrayList<>();
		for (Permissions p : allPermissionsList) {
			if(pid.equals(p.getParentid())) {
				childrenList.add(p);
			}
		}
		if(childrenList.size()!=0) {
			for (Permissions p : childrenList) {
				p.setChildren(getChildren(p.getPid(), allPermissionsList));
			}
		}
		return childrenList;
	}

	@Override
	public List<Permissions> transformTree2Oneview(List<Permissions> treeList) {
		List<Permissions> resultList=new ArrayList<>();
		transformTree(treeList,resultList);
		return resultList;
	}
	//递归将有层次的集合转换为平级，即所有的权限放入同一个集合中
	public void transformTree(List<Permissions> treeList,List<Permissions> resultList) {
		for (Permissions p : treeList) {
			resultList.add(p);
			if(p.getChildren()!=null) {
				transformTree(p.getChildren(),resultList);
			}
		}
	}
}
