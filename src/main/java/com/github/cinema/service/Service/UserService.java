package com.github.cinema.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.cinema.entity.UsersEntity;
import com.github.cinema.repositories.HomeRepository;
import com.github.cinema.repositories.UserRepository;
import com.github.cinema.service.IService.UserIService;

@Service
public class UserService implements UserIService,UserDetailsService {

	@Autowired
	UserRepository userRp;
	
	@Autowired
	HomeRepository repo;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<UsersEntity> findAllUser() {
		
		return repo.findAllUser();
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

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
