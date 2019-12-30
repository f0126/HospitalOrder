package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersMapper;
import com.woniu.domain.Roles;
import com.woniu.domain.Users;
import com.woniu.domain.UsersExample;
import com.woniu.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersMapper mapper;
	@Override
	public void save(Users u) {
		mapper.insertSelective(u);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Users u) {
		mapper.updateByPrimaryKeySelective(u);
	}

	@Override
	public Users findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Users> findAll() {
		UsersExample example=new UsersExample();
		example.or().andUidNotEqualTo(-1);
		return mapper.selectByExample(example);
	}

	@Override
	public List<Roles> getRolesByUid(Integer id) {
		List<Roles> rolesByUid = mapper.getRolesByUid(id);
		return rolesByUid;
	}

	@Override
	public void insertBatch(Integer uid,Integer[] rids) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("uid", uid);
		for (Integer rid : rids) {
			map.put("rid", rid);
			mapper.insertBatch(map);
		}
	}

	@Override
	public void cancelHasedRoles(Integer uid) {
		mapper.cancelHasedRoles(uid);
	}

}
