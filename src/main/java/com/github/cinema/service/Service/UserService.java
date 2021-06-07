package com.github.cinema.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.cinema.entity.UsersEntity;
import com.github.cinema.repositories.UserRepository;
import com.github.cinema.service.IService.UserIService;

@Service
public class UserService implements UserIService{

	@Autowired
	UserRepository userRp;

	@Override
	public List<UsersEntity> findAllUser() {
		
		return userRp.findAll();
	}
	
	
}
