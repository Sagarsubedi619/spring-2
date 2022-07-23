package com.loginform.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginform.model.UsersModel;

public interface iUserRepo extends  JpaRepository<UsersModel, Integer> {

	Optional<UsersModel> findByLoginAndPassword(String login,String password);
}
