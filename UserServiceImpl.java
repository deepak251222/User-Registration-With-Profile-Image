package com.main.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.main.Dao.UserRepo;
import com.main.Entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepo userRepo;
	@Override
	public User add(User user) {
        System.out.println("service !11111" +user);
		User user1=userRepo.save(user);
		
		return user1;
	}


}


