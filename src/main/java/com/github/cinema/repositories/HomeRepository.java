package com.github.cinema.repositories;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.github.cinema.entity.UsersEntity;
import com.github.cinema.service.IService.UserIService;

@Repository
public class HomeRepository implements UserIService{

	@Autowired
	MongoTemplate tm;

	@Override
	public List<UsersEntity> findAllUser() {
//		Query sql = new Query();
//		Update up = new Update();
		// TODO Auto-generated method stub
		final List<UsersEntity> rs = tm.findAll(UsersEntity.class);
		return rs;
		
	}

	@Override
	public void insertUser(UsersEntity user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateUser(UsersEntity user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
