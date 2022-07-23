package com.loginform.service;

import org.springframework.stereotype.Service;

import com.loginform.model.UsersModel;
import com.loginform.repository.iUserRepo;

@Service
public class UsersService {

	private final iUserRepo userRepo;

	public UsersService(iUserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public UsersModel registerUser(String login, String password, String email) {
		if (login == null || password == null) {
			UsersModel usersModel = new UsersModel();
			usersModel.setLogString(login);
			usersModel.setPasswordString(password);
			usersModel.setEmailString(email);
			return userRepo.save(usersModel);
		} else {
			return null;
		}
	}
	
	public UsersModel authenticate(String login,String password) {
		return userRepo.findByLoginAndPassword(login, password).orElse(null);
		
	}

}
