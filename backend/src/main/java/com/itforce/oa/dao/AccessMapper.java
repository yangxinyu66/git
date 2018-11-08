package com.itforce.oa.dao;

import com.itforce.oa.bean.Access;

public interface AccessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Access record);

    int insertSelective(Access record);

    Access selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Access record);

    int updateByPrimaryKey(Access record);
}