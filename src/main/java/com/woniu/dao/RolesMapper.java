package com.woniu.dao;

import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RolesMapper {
    long countByExample(RolesExample example);

    int deleteByExample(RolesExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExample(RolesExample example);

    Roles selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
    
  //获得某个角色已有权限集合
  	List<Permissions> getPermissionsByRid(Integer id);
  	//取消角色已有权限
  	void cancelPermissionsByRid(Integer rid);
  	//批量授权
  	void insertBatch(Map<String, Integer> map);
}