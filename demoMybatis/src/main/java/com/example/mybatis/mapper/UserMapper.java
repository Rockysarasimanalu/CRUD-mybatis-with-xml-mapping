package com.example.mybatis.mapper;

import java.util.List;

import com.example.mybatis.domain.User;

public interface UserMapper {

	public void insertUser(User user);
	public User getUserById(Integer userId);
	public List<User> getAllUser();
	public User updateUser(User user);
	public void deleteUser(Integer userId);
}
