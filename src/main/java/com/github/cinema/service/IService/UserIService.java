package com.github.cinema.service.IService;

import java.util.List;

import com.github.cinema.entity.UsersEntity;

public interface UserIService {

	List<UsersEntity> findAllUser();
	
	void insertUser (UsersEntity user);
	
	boolean updateUser (UsersEntity user);
}
