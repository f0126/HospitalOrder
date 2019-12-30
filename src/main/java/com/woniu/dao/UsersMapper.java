package com.woniu.dao;

import com.woniu.domain.Roles;
import com.woniu.domain.Users;
import com.woniu.domain.UsersExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
  //根据用户查所拥有的角色
  	List<Roles> getRolesByUid(Integer id);
  	//批量分配角色
  	void insertBatch(Map<String, Integer> map);
  	//取消现有的角色
  	void cancelHasedRoles(Integer uid);
}