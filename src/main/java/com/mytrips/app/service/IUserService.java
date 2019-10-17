package com.mytrips.app.service;

import com.mytrips.app.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<UserEntity> buscarTodos();

    Optional<UserEntity> findUser(String email, String password);

    UserEntity createUser(UserEntity user);
}
