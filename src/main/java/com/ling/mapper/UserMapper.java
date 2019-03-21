package com.ling.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ling.entity.User;

@Mapper
public interface UserMapper {
	public int insert(User record);

	public User getUser(Long id);
}