package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RolesMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;
import com.woniu.service.RolesService;

@Service
@Transactional
public class RolesServiceImpl implements RolesService{

	@Autowired
	RolesMapper mapper;
	
	@Override
	public void save(Roles r) {
		mapper.insertSelective(r);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Roles r) {
		mapper.updateByPrimaryKeySelective(r);
	}

	@Override
	public Roles findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Roles> findAll() {
		RolesExample example=new RolesExample();
		example.or().andRidNotEqualTo(-1);
		return mapper.selectByExample(example);
	}

	@Override
	public List<Permissions> getPermissionsByRid(Integer id) {
		List<Permissions> permissionsByRid = mapper.getPermissionsByRid(id);
		return permissionsByRid;
	}

	@Override
	public void cancelPermissionsByRid(Integer rid) {
		mapper.cancelPermissionsByRid(rid);
	}

	@Override
	public void insertBatch(Integer rid, Integer[] pids) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("rid", rid);
		for (int i = 0; i < pids.length; i++) {
			map.put("pid", pids[i]);
			mapper.insertBatch(map);
		}
	}


}
